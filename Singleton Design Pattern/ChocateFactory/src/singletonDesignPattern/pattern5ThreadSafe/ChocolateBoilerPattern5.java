package singletonDesignPattern.pattern5ThreadSafe;

/**
 * 1. Double-checked locking - use synchronised block
 * 2. After first initialization threads will not access the synchronised block
 * 3. This implementation can be broken by reflection in java
 */

public class ChocolateBoilerPattern5 {
    private static ChocolateBoilerPattern5 instance;
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
