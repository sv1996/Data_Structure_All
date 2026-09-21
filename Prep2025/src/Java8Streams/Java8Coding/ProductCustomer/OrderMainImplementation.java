package Java8Streams.Java8Coding.ProductCustomer;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMainImplementation {

    public static void main(String[] args) {
        // creating order data List
        List<Order> orderList = List.of(new Order(1L, LocalDate.now().minusDays(1),
                LocalDate.now().plusDays(1), "Passed", new Customer(1L, "Shivam", 12)),
                new Order(2L, LocalDate.now().minusDays(2), LocalDate.now().plusDays(2), "Failed", new Customer(2L, "Ankit", 15)), new Order(3L, LocalDate.now().minusDays(3), LocalDate.now().plusDays(3), "Passed", new Customer(3L, "Rahul", 10)), new Order(4L, LocalDate.now().minusDays(4), LocalDate.now().plusDays(4), "Pending", new Customer(4L, "Ramesh", 8)));
        // Exercise 6 — Get the 3 most recent placed order
        orderList.stream().sorted((o1, o2) -> o2.getOrderDate().compareTo(o1.getOrderDate())).limit(3).forEach(o -> System.out.println("Order ID: " + o.getId() + ", Order Date: " + o.getOrderDate()));
        // using sorted method reference
        System.out.println("Using Method Reference..!!");
        orderList.stream().sorted(Comparator.comparing(Order::getOrderDate).reversed()).limit(3).forEach(o ->
                System.out.println("Order ID: " + o.getId() + ", Order Date: " + o.getOrderDate()));

        //  Obtain a data map with order id and order’s product count
        orderList.stream().collect(Collectors.toMap(order -> order.getId(), order -> order.getCustomer().getProductCount()))
                .forEach((id, count) -> System.out.println("Order ID: " + id + ", Product Count: " + count));
        // Exercise 12 — Produce a data map with order records grouped by customer
        Map<Customer, List<Order>> dataMap = orderList.stream().collect(Collectors.groupingBy(Order::getCustomer));
        System.out.println("Data Map Grouped by Customer: ");
        dataMap.forEach((customer, orders) -> {
            System.out.println("Customer: " + customer);
            orders.forEach(order -> System.out.println("  Order: " + order));
        });

    }
}