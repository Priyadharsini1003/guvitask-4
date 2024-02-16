package guvitask;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5]; 

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product ID, price, and quantity for product " + (i + 1));
            String pid = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        double totalSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalSpent);
        
        sc.close(); 
    }

    public static double calculateTotalAmountSpent(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.calculateTotalPrice();
        }
        return total;
    }
}
