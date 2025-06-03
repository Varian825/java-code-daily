import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        int a = 10;
        ArrayList a2 = new ArrayList(); //no generic
        ArrayList<String> a1 = new ArrayList<>(); //cast <data type> => generic
//        a1.add(2); //integer => Integer
        a1.add("Chu An Dev");
        a1.add("Varian Truong");
        a1.add("An Truong");

        System.out.println(a1.toString() + " " + a1.size());
    }
}
