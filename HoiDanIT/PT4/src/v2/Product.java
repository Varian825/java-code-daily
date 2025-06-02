package v2;

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

    //accessor props: getter & setter
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

    //method
    public Product inputInfo(String name, double price, double tax) {
        Product p = new Product(name, price, tax);
        return p;
    }

    public void showInfo(Product p) {
        System.out.println("Name: " + p.getName() + ", Price: " + p.getPrice() + ", Tax: " + p.getTax());
    }

    public double calTaxPrice(double price, double tax) {
        return this.price * this.tax;
    }

}
