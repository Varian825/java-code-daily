package v2;

public class Program {
    public static void main(String[] args) {
        Product test = new Product();
        Product p1 = test.inputInfo("Computer", 200, 0.1);
        test.showInfo(p1);
        System.out.println("So tien thue = " + test.calTaxPrice(p1.getPrice(), p1.getTax()));
    }
}
