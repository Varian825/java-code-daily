import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            multiplicationTable(num);
        } else {
            System.out.println(num + " khong la so nguyen to, nen bang cuu chuong la: ko kó");
        }
        sc.close();
    }

    //isPrime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //Multiplication Table
    public static void multiplicationTable(int num) {
        System.out.println("BANG CUU CHUONG " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
