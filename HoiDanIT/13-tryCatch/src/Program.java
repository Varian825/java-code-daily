import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        //try with resource
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
        }

        //try catch finally
//        try {
//            int x = sc.nextInt();
//            System.out.println("run try");
//        } catch (Exception e) {
//            System.out.println("run catch");
//        } finally {
//            System.out.println("run finally");
//            sc.close();
//        }

        //try catch
//        while (true) {
//            try {
//                int x = sc.nextInt();
//                try {
//                    System.out.println(10 / x);
//                    break;
//                } catch (Exception e) {
//                    System.out.println("error x = " + x);
//                }
//            } catch (Exception e) {
//                System.out.println("run error");
//                sc.next();
//            }
//        }

    }
}
