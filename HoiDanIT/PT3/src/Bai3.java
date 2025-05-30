import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element: ");
        //for reading the element
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        //for print the array element
        System.out.print("Output array:  ");
        for (int e : arr) {
            System.out.print(e + "  ");
        }

        //Array sorted
        Arrays.sort(arr);
        System.out.print("\nArray sorted:  ");
        for (int e : arr) {
            System.out.print(e + "  ");
        }

        //Print min element
        int min = arr[0];
        int max = arr[0];
        for (int e : arr) {
            min = Math.min(min, e);
            max = Math.max(max, e);
        }
        System.out.println("\nMin element: " + min);
        System.out.println("Max element: " + max);

        sc.close();
    }
}
