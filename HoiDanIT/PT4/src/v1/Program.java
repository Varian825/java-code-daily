package v1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Nhap san pham 1 ---");
        Product p1 = new Product();
        p1.inputInfo(sc);
        p1.showInfo();

        System.out.println("--- Nhap san pham 2 ---");
        Product p2 = new Product();
        p2.inputInfo(sc);
        p2.showInfo();
        System.out.println("So tien thue: " + p2.getTaxPrice());

        sc.close();
    }
}
