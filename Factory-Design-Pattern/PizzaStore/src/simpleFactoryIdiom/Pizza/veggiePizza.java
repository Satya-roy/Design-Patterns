package simpleFactoryIdiom.Pizza;

import java.util.List;

public class veggiePizza extends pizza{
    public veggiePizza(String name,
                       String dough,
                       String sauce,
                       List<String> toppings) {
        super(name, dough, sauce, toppings);
    }
}
