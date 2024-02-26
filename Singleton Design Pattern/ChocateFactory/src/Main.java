import singletonDesignPattern.pattern3.ChocolateBoilerPattern3;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChocolateBoilerPattern3 instance1 = ChocolateBoilerPattern3.getInstance();
        ChocolateBoilerPattern3 instance2 = ChocolateBoilerPattern3.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}