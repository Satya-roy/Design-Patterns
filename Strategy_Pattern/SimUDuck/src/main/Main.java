package main;

import main.client.Duck;
import main.client.behaviors.client.MallardDuck;
import main.client.behaviors.client.RubberDuck;
import main.client.behaviors.flyBehavior.FlyBehavior;
import main.client.behaviors.flyBehavior.FlyNoWayImpl;
import main.client.behaviors.flyBehavior.FlyWithWingsImpl;
import main.client.behaviors.quackBehavior.QuackBehavior;
import main.client.behaviors.quackBehavior.QuackImpl;
import main.client.behaviors.quackBehavior.SqueakImpl;

public class Main {
    public static void main(String[] args) {
        // Mallard Duck
        FlyBehavior flyBehavior = new FlyWithWingsImpl();
        QuackBehavior quackBehavior = new QuackImpl();

        Duck mallardDuck = new MallardDuck();

        mallardDuck.setFlyBehavior(flyBehavior);
        mallardDuck.setQuackBehavior(quackBehavior);

        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        //Rubber Duck
        FlyBehavior flyBehavior1 = new FlyNoWayImpl();
        QuackBehavior quackBehavior1 = new SqueakImpl();
        Duck rubberDuck = new RubberDuck();

        rubberDuck.setFlyBehavior(flyBehavior1);
        rubberDuck.setQuackBehavior(quackBehavior1);

        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}