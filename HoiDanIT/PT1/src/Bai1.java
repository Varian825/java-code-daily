import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Your Name is: ");
        String name = scanner.nextLine();
        System.out.printf("Your Score is: ");
        int score = scanner.nextInt();
        System.out.println(name + " has a score of " + score);
        scanner.close();
    }
}
