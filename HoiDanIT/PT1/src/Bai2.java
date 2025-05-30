import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a = ");
        int a = scanner.nextInt();
        System.out.printf("b = ");
        int b = scanner.nextInt();
        System.out.println("Perimeter of Rectangle: " + ((a + b) * 2));
        System.out.println("Area Rectangle: " + (a * b));
        System.out.println("Min Edge: " + Math.min(a, b));
        scanner.close();
    }
}
