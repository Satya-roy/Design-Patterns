package main.client.behaviors.quackBehavior;

public class MuteQuackImpl implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("I am not a duck, I can't quack");
    }
}
