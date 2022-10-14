package main;

import main.client.Duck;
import main.client.behaviors.client.MallardDuck;
import main.client.behaviors.flyBehavior.FlyBehavior;
import main.client.behaviors.flyBehavior.FlyWithWingsImpl;
import main.client.behaviors.quackBehavior.QuackBehavior;
import main.client.behaviors.quackBehavior.QuackImpl;

public class Main {
    public static void main(String[] args) {
        FlyBehavior flyBehavior = new FlyWithWingsImpl();
        QuackBehavior quackBehavior = new QuackImpl();

        Duck mallardDuck = new MallardDuck();

        mallardDuck.setFlyBehavior(flyBehavior);
        mallardDuck.setQuackBehavior(quackBehavior);

        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}