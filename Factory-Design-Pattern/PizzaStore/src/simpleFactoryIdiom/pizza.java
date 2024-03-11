package simpleFactoryIdiom;

import javax.sound.midi.Soundbank;
import java.util.List;

public abstract class pizza {
    private String name;
    private String dough;
    private String sauce;

    private List<String> toppings;

    public pizza(String name,
                 String dough,
                 String sauce,
                 List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza diagonally");
    }

    public void box() {
        System.out.println("Put the pizza in official pizza box");
    }

    public String getName() {
        return name;
    }
}
