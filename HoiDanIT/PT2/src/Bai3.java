import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So dien la: ");
        int soDien = sc.nextInt();
        if (soDien <= 100) {
            System.out.print("So tien dien la: " + (soDien * 1000));
        } else {
            System.out.println("So tien dien la: " + ((100 * 1000) + ((soDien - 100) * 1500)));
        }
    }
}
