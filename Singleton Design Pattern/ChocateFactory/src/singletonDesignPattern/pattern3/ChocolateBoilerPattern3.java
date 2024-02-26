package singletonDesignPattern.pattern3;

/**
 * 1. Lazy Initialization -  the instance is not created until the class in invoked
 * 2. Draw Back - Not thread safe, for the first call when to create instance for the first time
 *                if more than 1 thread enter the if block then it lead to more than 1 instance creation
 */
public class ChocolateBoilerPattern3 {
    static private ChocolateBoilerPattern3 INSTANCE;

    private ChocolateBoilerPattern3() {}

    public static ChocolateBoilerPattern3 getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ChocolateBoilerPattern3();
        }
        return INSTANCE;
    }
}
