import singletonDesignPattern.pattern5ThreadSafe.MyThread;
import singletonDesignPattern.pattern6ThreadSafe.ChocolateBoilerPattern6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // -------------------------- Singleton Design Pattern --------------------------
        //multi-threading
        ExecutorService executorService = null;
        MyThread myThread = new MyThread();

        try{
            executorService = Executors.newFixedThreadPool(2);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(executorService != null) executorService.shutdown();
        }

        ChocolateBoilerPattern6 instance1 = ChocolateBoilerPattern6.INSTANCE;
        ChocolateBoilerPattern6 instance2 = ChocolateBoilerPattern6.INSTANCE;
        instance1.setBoiled(true);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        if(instance1.isBoiled()) {
            System.out.println("Chocolate is boiled");
        }
        //------------------------------------------------------------------------------
    }
}