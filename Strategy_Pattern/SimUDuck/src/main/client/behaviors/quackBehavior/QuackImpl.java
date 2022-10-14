package main.client.behaviors.quackBehavior;

public class QuackImpl implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("I am duck. I can quack");
    }
}
