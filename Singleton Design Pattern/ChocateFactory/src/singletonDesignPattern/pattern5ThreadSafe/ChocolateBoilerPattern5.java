package singletonDesignPattern.pattern5ThreadSafe;

/**
 * 1. Double-checked locking - use synchronised block
 * 2. After first initialization threads will not access the synchronised block
 * 3. This implementation can be broken by reflection in java
 * 4. volatile - so to have visibility to all threads
 */

public class ChocolateBoilerPattern5 {
    private static volatile ChocolateBoilerPattern5 instance;
    private ChocolateBoilerPattern5() {}

    public static ChocolateBoilerPattern5 getInstance() {
        if(instance == null) {                              // to avoid over-head because of lock
            synchronized (ChocolateBoilerPattern5.class) {
                if(instance == null) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    instance = new ChocolateBoilerPattern5();
                }
            }
        }
        return instance;
    }
}
