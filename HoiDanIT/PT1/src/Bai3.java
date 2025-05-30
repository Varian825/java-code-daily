import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Edge of Cube: ");
        int edge = scanner.nextInt();
        double volume = Math.pow(edge, 3);
        System.out.println("Volume of Cube: " + volume);
        scanner.close();
    }
}
