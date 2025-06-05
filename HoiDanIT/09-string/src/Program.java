import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Student st1 = new Student("Chu An", 20);
        Student st2 = new Student("Varian Truong", 25);
        Student st3 = new Student("An Truong", 8);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st3);
        list.add(st2);
        list.add(st1);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().startsWith("Varian")){
                System.out.println("Result: "+list.get(i));
            }
        }

        System.out.println("Array: " + list);
    }
}
