package main.client;

import main.client.behaviors.flyBehavior.FlyBehavior;
import main.client.behaviors.quackBehavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    //abstract method
    public abstract void display();
    //localized method
    public void swim(){
        System.out.println("I am Duck, I can swim");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
}
