package Strategy_Implementation;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void checkout() {
        double total = calculateTotal();
        paymentStrategy.processPayment(total);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}