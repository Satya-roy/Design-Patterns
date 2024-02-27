package singletonDesignPattern.pattern6ThreadSafe;
/**
 * 1. we can create a singleton class using enum, it is thread safe.
 * 2. safe from reflection.
 * 3. Draw back - eager loading
 */

public enum ChocolateBoilerPattern6 {
    INSTANCE;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerPattern6() {}

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public String welcome() {
        return "Chocolate factory";
    }
}
