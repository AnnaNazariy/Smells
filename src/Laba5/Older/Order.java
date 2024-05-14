package Laba5.Older;

import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private double totalPrice;

    public Order(String customerName, List<String> items) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Виокремлюємо логіку розрахунку загальної ціни в окремий метод
    private double calculateTotalPrice() {
        double price = 0.0;
        for (String item : items) {

        }
        return price;
    }
}
