import java.util.Scanner;

public class Bai1v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 2) {
            int count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print("Uoc so khac: " + i + "\n");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(num + " la so nguyen to?");
            } else {
                System.out.println(num + " khong la so nguyen to?");
            }
        }
        sc.close();
    }
}
