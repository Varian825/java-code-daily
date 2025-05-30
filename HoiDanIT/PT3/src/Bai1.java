import java.util.Scanner;

public class Bai1 {
    //isPrime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 2) {
            int isPrime = 1;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                } else {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 1) {
                System.out.println(num + " la so nguyen to ))");
            } else {
                System.out.println(num + " khong la so nguyen to ((");
            }
        } else {
            System.out.println(num + " khong la so nguyen to ((");
        }
    }
}
