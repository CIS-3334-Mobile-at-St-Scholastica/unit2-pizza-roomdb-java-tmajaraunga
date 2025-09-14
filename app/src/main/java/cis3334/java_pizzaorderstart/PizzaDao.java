package cis3334.java_pizzaorderstart;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
@Dao
public interface PizzaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Pizza pizza);

    @Query("DELETE FROM pizza_order")
    void deleteAll();

    @Query("SELECT * FROM pizza_order")
    List<Pizza> getAllPizzas();
}
