package strategyDesignPattern;

import strategyDesignPattern.PaymentStrategy.PaymentMethodStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int calculateTotalPrice() {
        return products.stream().map(Product::getPrice).reduce(0, Integer::sum);
    }

    public void payment(PaymentMethodStrategy paymentMethodStrategy) {
        int price = calculateTotalPrice();
        paymentMethodStrategy.pay(price);
    }
}
