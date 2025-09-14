package cis3334.java_pizzaorderstart;

import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainViewModel extends ViewModel {
    PizzaRepository myPizzaOrder = new PizzaRepository();

    public void placeOrder(String topping, Integer size) {
        myPizzaOrder.OrderPizza(topping, size);
    }

    // Get the order as a string
    public String getOrder() {
        String orderDescription = "";
        List<String> pizzaList = myPizzaOrder.getOrder();
        for (String strPizza:pizzaList ) {
            orderDescription += strPizza + "\n";
        }
        return orderDescription;
    }


}