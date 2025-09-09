package cis3334.java_pizzaorderstart;

import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainViewModel extends ViewModel {
    PizzaOrder myPizzaOrder = new PizzaOrder();

    public void placeOrder(String topping, Integer size) {
        myPizzaOrder.OrderPizza(topping, size);
    }

    // Get the order as a sring
    public String getOrder() {
        String orderDescription = "";
        List<String> pizzaList = myPizzaOrder.getOrder();
        for (String strPizza:pizzaList ) {
            orderDescription += strPizza + "\n";
        }
        return orderDescription;
    }


}