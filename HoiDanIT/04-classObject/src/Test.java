public class Test {
    public static void main(String[] args) {
        System.out.println("He loHe lo, Chu An Dev dei!");

        //Khai bao 1 object va gan gia tri
        Student st1 = new Student();
        st1.name = "Chu An";
        st1.age = 18;

        Student st2 = new Student();
        st2.name = "An Truong";
        st2.age = 20;

        System.out.println("Name: " + st1.name + ", Age: " + st1.age);
        System.out.println("Name: " + st2.name + ", Age: " + st2.age);
    }
}
