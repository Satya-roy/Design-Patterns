package singletonDesignPattern.pattern4ThreadSafe;

import singletonDesignPattern.pattern4ThreadSafe.ChocolateBoilerPattern4;

public class MyThread implements Runnable {
    @Override
    public void run() {
        ChocolateBoilerPattern4 INSTANCE = ChocolateBoilerPattern4.getINSTANCE();

        System.out.println(Thread.currentThread().getName()+" "+INSTANCE.hashCode());
    }
}
