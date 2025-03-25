package com.mps;


import java.util.*;
import java.util.stream.Collectors;

class Order {
    private int id;
    private String name;
    private int price;
    private String month;
    private int year;
    private String city;
    private String category;
    private int quantity;

    public Order(int id, String name, int price, String month, int year, String city, String category, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.month = month;
        this.year = year;
        this.city = city;
        this.category = category;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getMonth() { return month; }
    public String getCategory() { return category; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return "Order id=" + id + ", name=" + name + ", price=" + price + ", month=" + month + ", year=" + year
                + ", city=" + city + ", category=" + category + ", quantity=" + quantity ;
    }
}

public class Ques {

    // 1. Find highest orders in the year
    public static void getHighestOrder(List<Order> data) {
        Optional<Order> highOrder = data.stream()
                .max(Comparator.comparing(Order::getPrice)); // Find max price order

        highOrder.ifPresent(ord -> {
            System.out.println("Highest order in the year:");
            System.out.println("ID: " + ord.getId() + ", Name: " + ord.getName() + ", Price: " + ord.getPrice());
        });
    }

    // 2. Find category-wise orders
    public static void getCategoryWiseOrders(List<Order> data) {
        Map<String, List<Order>> categoryWiseOrders = data.stream()
                .collect(Collectors.groupingBy(Order::getCategory));

        System.out.println("\nCategory-wise Orders:");
        //forEach(key, value)
        categoryWiseOrders.forEach((category, orders)-> {
            System.out.println("Category: " + category);
            orders.forEach(System.out::println);
        });
    }

    // 3. Print max price order
    public static void getMaxPrice(List<Order> data) {
        Optional<Order> maxPrice = data.stream()
        		.sorted(Comparator.comparing(Order :: getPrice).reversed())
				.findFirst();
                //.mapToInt(Order::getPrice)
                //.max();
        System.out.println("\nMaximum Order Price: " + maxPrice);
    }

    // 4. Average monthly spending in e-commerce
    public static void getAvgMonthlySpending(List<Order> data) {
        Map<String, Double> avgMonthlySpending = data.stream()
                .collect(Collectors.groupingBy(
                        Order::getMonth,
                        Collectors.averagingInt(Order::getPrice)
                ));

        System.out.println("\nAverage Monthly Spending:");
        avgMonthlySpending.forEach((month, avg) -> System.out.println(month + ": " + avg));
    }

    // 5. Find out min order price in total orders
    public static void getMinOrderPrice(List<Order> data) {
        Optional<Order> minPrice = data.stream()
        		.sorted(Comparator.comparing(Order :: getPrice))
				.findFirst();
               // .mapToInt(Order::getPrice)
               // .min();
        System.out.println("\nMinimum Order Price: " + minPrice);
    }

    // 6. Find out the 1st order of the customer
    public static void getFirstOrder(List<Order> data) {
        Optional<Order> firstOrder = data.stream()
                .sorted(Comparator.comparing(Order::getId))
                .findFirst();

        System.out.println("\nFirst Order: " + firstOrder);
    }

    public static void main(String[] args) {
        List<Order> data = new ArrayList<>();
        data.add(new Order(111, "Lenovo", 40000, "June", 2025, "Hyd", "Laptop", 5));
        data.add(new Order(122, "Sony", 45000, "March", 2025, "Pune", "TV", 3));
        data.add(new Order(133, "Lenovo", 25000, "May", 2025, "Chennai", "Phone", 8));
        data.add(new Order(144, "Asus", 75000, "March", 2025, "Bangalore", "Laptop", 10));
        data.add(new Order(155, "Apple", 57000, "June", 2025, "Hyd", "Phone", 2));
        data.add(new Order(166, "Apple", 90000, "April", 2025, "Chennai", "Laptop", 4));
        data.add(new Order(177, "HP", 50000, "May", 2025, "Pune", "Laptop", 4));

        getHighestOrder(data);
        getCategoryWiseOrders(data);
        getMaxPrice(data);
        getAvgMonthlySpending(data);
        getMinOrderPrice(data);
        getFirstOrder(data);
    }
}



