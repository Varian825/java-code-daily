import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //ax + b = 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai PT: ax + b = 0");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.printf("PT: %dx + %d = 0\n", a, b);
        if (a == 0 && b == 0) {
            System.out.println("PT co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("PT vo nghiem");
        } else {
            System.out.println("=> x = " + ((-b / (float) a)));
        }
    }
}
