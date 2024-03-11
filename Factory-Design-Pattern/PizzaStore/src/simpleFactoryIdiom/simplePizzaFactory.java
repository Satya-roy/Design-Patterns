package simpleFactoryIdiom;

import simpleFactoryIdiom.Pizza.cheezePizza;
import simpleFactoryIdiom.Pizza.clamPizza;
import simpleFactoryIdiom.Pizza.pizza;
import simpleFactoryIdiom.Pizza.veggiePizza;

import java.util.List;

public class simplePizzaFactory {
    private simplePizzaFactory() {}; //make the constructor private

    //create a static method to get pizza
    public static pizza getPizza(pizzaType type,
                          String name,
                          String dough,
                          String sauce,
                          List<String> toppings) {
        return switch (type) {
            case CLAM_PIZZA -> new clamPizza(name, dough, sauce, toppings);
            case CHEEZE_PIZZA -> new cheezePizza(name, dough, sauce, toppings);
            case VEGGIE_PIZZA -> new veggiePizza(name, dough, sauce, toppings);
            default -> {
                System.out.println("throw error");
                throw new RuntimeException("Not a valid pizza");
            }
        };
    }
}
