import simpleFactoryIdiom.Pizza.pizza;
import simpleFactoryIdiom.pizzaType;
import simpleFactoryIdiom.simplePizzaFactory;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Factory design pattern");

        pizza cheezePizza = simplePizzaFactory.getPizza(pizzaType.CHEEZE_PIZZA,
                "cheezePizza",
                "Thin crust dough",
                "Marinara Sauce",
                new ArrayList<>(List.of("Grated Reggino Cheeze")));

        System.out.println(cheezePizza.getName());
    }
}