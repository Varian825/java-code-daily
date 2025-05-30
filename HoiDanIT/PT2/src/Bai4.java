import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>      LUA CHON TINH NANG       <<");
        System.out.println("++ ----------------------------- ++");
        System.out.println("|  1. Giai phuong trinh bac nhat  |");
        System.out.println("|  2. Giai phuong trinh bac hai   |");
        System.out.println("|  3. Tinh so dien                |");
        System.out.println("|  4. Ket thuc                    |");
        System.out.println("++ ----------------------------- ++");
        System.out.print("Ban lua chon tinh nang la: ");
        int item = sc.nextInt();
        switch (item) {
            case 1:
                Bai1.main(args);
                break;
            case 2:
                Bai2.main(args);
                break;
            case 3:
                Bai3.main(args);
                break;
            default:
                System.out.println("Ket thuc chuong trinh");
        }
        sc.close();
    }
}
