import singletonDesignPattern.pattern3.ChocolateBoilerPattern3;
import singletonDesignPattern.pattern5ThreadSafe.MyThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
    }
}