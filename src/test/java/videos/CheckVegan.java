package videos;

public class CheckVegan implements OrderCheck{
    @Override
    public boolean checkConditions(Order order) {
      return order.isVegan;
    }
}
