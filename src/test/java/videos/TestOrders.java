package videos;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrders {

    @Test
    public void checkOrders() {
        Order firstOrder = new Order(150, true, "Svitlana");
        Order secondOrder = new Order(135, true, "Nikita");
        Order thirdOrder = new Order(270, false, "Alex");
        Order fourthOrder = new Order(785, true, "Andrew");
        Order fifthOrder = new Order(640, false, "Vadym");
        Order sixthOrder = new Order(75, true, "Ivan");

        List<Order> orders = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder, fifthOrder, sixthOrder);

//        for (videos.Order order : orders) {
//            System.out.println(order);
//        }

//        videos.OrderFiltering orderFiltering = new videos.OrderFiltering(orders);
//        orderFiltering.printVegan();

        printConditions(orders, new OrderCheck() {
            @Override
            public boolean checkConditions(Order order) {
                return order.isVegan;
            }
        });

//        printConditions(orders, new videos.CheckPriceMoreThan100());
    }

    public void printConditions(List<Order> orderList, OrderCheck orderCheck){
        for (Order order : orderList){
            if (orderCheck.checkConditions(order)) {
                System.out.println(order);
            }
        }
    }
}
