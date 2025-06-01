
public class Student {

    //class fields: thuoc tinh mieu ta doi tuong
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name1, int age1) {
        this.name = name1;
        this.age = age1;
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

    //class method: hanh vi cua doi tuong
    public void learJava() {
        System.out.println("Learn Java with Chu An @_@");
    }


}


