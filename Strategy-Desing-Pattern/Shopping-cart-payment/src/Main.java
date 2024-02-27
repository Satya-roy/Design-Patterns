import strategyDesignPattern.PaymentStrategy.CreditCardPaymentStrategy;
import strategyDesignPattern.PaymentStrategy.PayPalPaymentStrategy;
import strategyDesignPattern.Product;
import strategyDesignPattern.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //-------------------------- Strategy Design Pattern --------------------------
        Product product1 = new Product("Chips", "00067", 25);
        Product product2 = new Product("Chocolate", "00988", 125);
        Product product3 = new Product("Pen", "00101", 10);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        int price = shoppingCart.calculateTotalPrice();

        shoppingCart.payment(new CreditCardPaymentStrategy("Satya", "HBCF", "213", "090909"));
        shoppingCart.payment(new PayPalPaymentStrategy("satya@gfg", "xccccx"));
    }
}