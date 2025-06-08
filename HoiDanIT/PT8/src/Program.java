public class Program {
    public static void main(String[] args) {
        Student st1 = new Student("123", "Chu An", 20, 4);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);

        Person p1 = new Person("123", "An Chu", 18);
        System.out.println(p1);
    }
}
