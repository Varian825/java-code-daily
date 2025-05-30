import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0
        Scanner sc = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("PT co vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("PT vo nghiem");
            } else {
                System.out.println("PT co 1 nghiem x = " + (-c / b));
            }
        } else {
            double del = b * b - 4 * a * c;
            if (del < 0) {
                System.out.println("PT co vo so nghiem");
            } else if (del == 0) {
                System.out.println("PT co nghiem kep x = " + (-b / (2 * a)));
            } else {
                System.out.println("PT co 2 nghiem rieng biet: ");
                System.out.printf("x1 = %.3f\n", ((-b + Math.sqrt(del)) / (2 * a)));
                System.out.printf("x2 = %.3f", ((-b - Math.sqrt(del)) / (2 * a)));
            }
        }
        sc.close();
    }
}
