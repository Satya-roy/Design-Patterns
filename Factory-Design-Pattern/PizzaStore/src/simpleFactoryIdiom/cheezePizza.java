package simpleFactoryIdiom;

import java.util.List;

public class cheezePizza extends pizza{

    public cheezePizza(String name,
                       String dough,
                       String sauce,
                       List<String> toppings) {
        super(name, dough, sauce, toppings);
    }
}
