package main.client.behaviors.flyBehavior;

public class FlyNoWayImpl implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I am not a Duck, I can't fly");
    }
}
