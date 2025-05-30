import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">> LUA CHON TINH NANG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("|  1. Cong             |");
        System.out.println("|  2. Tru              |");
        System.out.println("|  3. Ket thuc         |");
        System.out.println("++ ------------------ ++");
        System.out.print("Lua chon cua ban la: ");
        int value = sc.nextInt();
        switch (value){
            case 1:
                System.out.println("Ban da chon phep cong");
                break;
            case 2:
                System.out.println("Ban da chon phep tru");
                break;
            default:
                System.out.println("Ban da chon thoat chuong trinh");
                System.exit(0);
        }
        int value1 = sc.nextInt();
        sc.close();


//        System.out.println("What day? ");
//        int day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("I don't know");
//        }
    }
}
