package main.client.behaviors.quackBehavior;

public class SqueakImpl implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("I am rubber duck,I squeak");
    }
}
