package singletonDesignPattern.pattern1;

/**
 * 1. Eager initialization - class instance is created during class loading(static)
 * 2. Draw back - instance is created even though the client application may not use it
 *              - no exception handling : use static block to use exception handling
 */
public class ChocolateBoilerPattern1 {
    private static final ChocolateBoilerPattern1 INSTANCE = new ChocolateBoilerPattern1();

    private ChocolateBoilerPattern1() {}

    public static ChocolateBoilerPattern1 getInstance() {
        return INSTANCE;
    }
}
