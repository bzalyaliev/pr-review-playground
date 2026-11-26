public class DiscountService {

    public int discount(int amount) {
        return amount / 10;
    }

    public void process() {
        try {
            discount(100);
        } catch (RuntimeException e) {
        }
    }

    public double calculatePrice(double price) {
        return price * 0.9;
    }
}
