package strategyDesignPattern.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentMethodStrategy {
    private String cardHolderName;
    private String card;
    private String cvv;
    private String date;

    public CreditCardPaymentStrategy (String cardHolderName,
                                      String card,
                                      String cvv,
                                      String date) {
        this.cardHolderName = cardHolderName;
        this.card = card;
        this.cvv = cvv;
        this.date = date;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCard() {
        return card;
    }

    public String getCvv() {
        return cvv;
    }

    public String getDate() {
        return date;
    }

    public void pay(int price) {
        System.out.println("Did the payment via Credit card " + price);
    }
}
