public class Program {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVienIT(9.5, 9.5);
        SinhVien sv2 = new SinhVienCoKhi(8, 7);

        System.out.println("Score: " + sv1.getScore());
        System.out.println("Score: " + sv2.getScore());


    }
}
