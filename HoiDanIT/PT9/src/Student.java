import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    // constructor
    public Student() {
    }

    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter & setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    //method
    public void inputID(Scanner sc) {
        while (true) {
            System.out.println("Enter ID: ");
            try {
                this.id = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("id error, Enter id is number");
                sc.next();
            }
        }
    }


}
