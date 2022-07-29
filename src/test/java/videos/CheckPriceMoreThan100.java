package videos;

public class CheckPriceMoreThan100 implements OrderCheck{
    @Override
    public boolean checkConditions(Order order) {
        return order.price > 100;
    }
}
