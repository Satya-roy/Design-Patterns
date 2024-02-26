package singletonDesignPattern.pattern2;
/**
1. EagerInitialization - with static block : helps to handle exception
 */

public class ChocolateBoilerPattern2 {
    private static ChocolateBoilerPattern2 INSTANCE;

    private ChocolateBoilerPattern2() {}

    static {
        try {
            if(INSTANCE == null) {
                INSTANCE = new ChocolateBoilerPattern2();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static ChocolateBoilerPattern2 getInstance() {
        return INSTANCE;
    }
}
