public class Program1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("Name: " + st1.name + ", Age: " + st1.age);

        Student st2 = new Student("An", 20);
        System.out.println("Name: " + st2.name + ", Age: " + st2.age);
    }
}
