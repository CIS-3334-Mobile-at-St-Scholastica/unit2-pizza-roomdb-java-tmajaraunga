package cis3334.java_pizzaorderstart;

import android.content.Context;
import android.util.Log;
import androidx.room.Database;
//import androidx.room.PizzaDatabase;
//import androidx.room.Pizza;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class PizzaDatabase {
    public abstract PizzaDao pizzaDao();

    private static volatile PizzaDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static PizzaDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (PizzaDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Pizza.databaseBuilder(context.getApplicationContext(),
                                    PizzaDatabase.class, "word_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
