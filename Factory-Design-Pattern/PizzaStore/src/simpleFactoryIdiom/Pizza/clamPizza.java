package simpleFactoryIdiom.Pizza;

import java.util.List;

public class clamPizza extends pizza{
    public clamPizza(String name,
                       String dough,
                       String sauce,
                       List<String> toppings) {
        super(name, dough, sauce, toppings);
    }

    public void cut() {
        System.out.println("Cut pizza in square diagonals");
    }
}
