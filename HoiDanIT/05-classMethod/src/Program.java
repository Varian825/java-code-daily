public class Program {
    public int sumNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Program num = new Program();
        int rst = num.sumNumber(8, 2);
        System.out.println("Result = " + rst);
    }
}
