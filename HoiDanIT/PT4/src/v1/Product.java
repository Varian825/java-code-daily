package v1;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double tax;

    //constructor
    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    //accessor props
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void inputInfo(Scanner sc) {
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter tax: ");
        this.tax = sc.nextDouble();
        sc.nextLine();//don buffer
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + ", Price: " + this.price + ", Tax: " + this.tax);
    }

    public double getTaxPrice() {
        return this.price * this.tax;
    }
}
