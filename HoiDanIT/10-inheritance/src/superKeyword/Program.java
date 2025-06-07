package superKeyword;

public class Program {
    public static void main(String[] args) {
        SinhVienIT sv1 = new SinhVienIT("123", "Chu An", 10, 0.1, "Java");
        sv1.getMoney();
        System.out.println("Check: "+ sv1.id);

        SinhVienCoKhi sv2 = new SinhVienCoKhi("345", "Varian Truong", 10, 0.1, "Machine");
        System.out.println("Check: "+ sv2.name );
    }
}
