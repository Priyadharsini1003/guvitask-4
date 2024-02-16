package guvitask;

public class Product {
    public String pid;
    private double price;
    private int quantity;

    public Product(String pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return price * quantity;a
    }

    
}

