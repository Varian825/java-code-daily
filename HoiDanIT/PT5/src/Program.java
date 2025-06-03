import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true){
            System.out.println("Enter x: ");
            double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.println("Add (Y/N): ");
            String option = sc.nextLine().trim().toUpperCase(); //bo khoang trang va viet hoa
            if(option.equals("N")){
                break;
            }
        }

        System.out.println("Array: " + list);

        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
