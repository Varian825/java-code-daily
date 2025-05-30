import java.util.Scanner;

public class DemoIfElse {
    public static void main(String[] args) {
//        -dưới 10M: không đóng thuế
//        -từ 10M tới 15M: thuế 10%
//        -từ 15 tới 30M: thuế 20%
//        -trên 30M: thuế 50%

        Scanner sc = new Scanner(System.in);
        System.out.print("So tien thue: ");
        int tax = sc.nextInt();
        if(tax < 10){
            System.out.println("Khong dong thue nha");
        }else if(10 <= tax && tax < 15){
            System.out.println("Thue 10%");
        }else if(15 <= tax && tax < 20){
            System.out.println("Thue 20%");
        }else {
            System.out.println("Thue 30%");
        }
        sc.close();
    }
}
