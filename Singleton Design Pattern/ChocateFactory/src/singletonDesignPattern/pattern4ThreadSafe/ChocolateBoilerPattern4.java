package singletonDesignPattern.pattern4ThreadSafe;

/**
 * 1. Synchronized let us provide lock on the class as function is static - hence no 2 threads can access the
 *    thread at the same time
 * 2. Draw back - it add extra over-head as first time the synchronized is used till the instance is created
 */
public class ChocolateBoilerPattern4 {
    private static ChocolateBoilerPattern4 INSTANCE;
    private ChocolateBoilerPattern4() {};
    public static synchronized ChocolateBoilerPattern4 getINSTANCE() {
//         trying to break the code for multi-thread system
            try {
                Thread.sleep(2000);
            } catch(Exception e) {
                e.printStackTrace();
            }

        if(INSTANCE == null) {
            INSTANCE = new ChocolateBoilerPattern4();
        }
        return INSTANCE;
    }
}
