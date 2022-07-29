package videos;

public class Order {
    int price;
    boolean isVegan;
    String customerName;

    public Order(int price, boolean isVegan, String customerName) {
        this.price = price;
        this.isVegan = isVegan;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "videos.Order price is " + price + ", is Vegan? - " + isVegan + ", customer name is " + customerName;
    }
}
