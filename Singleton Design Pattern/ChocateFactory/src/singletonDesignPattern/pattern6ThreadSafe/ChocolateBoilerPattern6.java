package singletonDesignPattern.pattern6ThreadSafe;
/**
 * 1. we can create a singleton class using enum, it is thread safe.
 * 2. safe from reflection.
 * 3. Draw back - eager loading
 */

public enum ChocolateBoilerPattern6 {
    INSTANCE;

    public String welcome() {
        return "Chocolate factory";
    }
}
