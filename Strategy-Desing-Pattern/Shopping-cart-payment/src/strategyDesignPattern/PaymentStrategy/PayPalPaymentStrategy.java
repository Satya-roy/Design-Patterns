package strategyDesignPattern.PaymentStrategy;

public class PayPalPaymentStrategy implements PaymentMethodStrategy {
    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void pay(int price) {
        System.out.println("Did the payment using PayPal " + price);
    }
}
