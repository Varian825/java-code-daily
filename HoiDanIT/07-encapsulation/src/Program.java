
public class Program {

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("An Chu", 20);
        st2.setName("Chu An");
        System.out.println("Name: " + st2.getName() + ", Age: " + st2.getAge());
    }
}


