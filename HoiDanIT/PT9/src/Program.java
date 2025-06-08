import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Student st1 = new Student(123, "Anchu", 9, 10);
        st1.inputID(sc);
        System.out.println(st1);

        sc.close();
    }
}
