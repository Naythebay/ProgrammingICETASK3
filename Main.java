/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chartapplication.mavenproject11icetask3;

/**
 *
 * @author User
 */
public class Mavenproject11ICETASK3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double getDiscountedPrice();
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price - (price * 0.10); // 10% discount
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return price - (price * 0.05); // 5% discount
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Clothing("T-Shirt", 250.00);
        products[1] = new Clothing("Jeans", 600.00);
        products[2] = new Electronics("Headphones", 800.00);
        products[3] = new Electronics("Phone Charger", 300.00);

        for (Product p : products) {
            System.out.println(p.name + " - Original: R" + p.price + 
                               " | Discounted: R" + p.getDiscountedPrice());
        }
    }
}