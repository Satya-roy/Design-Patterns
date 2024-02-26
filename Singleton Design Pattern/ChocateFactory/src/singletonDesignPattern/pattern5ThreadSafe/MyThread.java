package singletonDesignPattern.pattern5ThreadSafe;

public class MyThread implements Runnable{
    @Override
    public void run() {
        ChocolateBoilerPattern5 instance = ChocolateBoilerPattern5.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance.hashCode());
    }
}
