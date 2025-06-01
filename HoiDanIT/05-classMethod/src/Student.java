public class Student {

    //class fields: thuoc tinh mieu ta doi tuong
    String name;
    int age;

    public Student() {
    }

    public Student(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }

    //class method: hanh vi cua doi tuong
    public void learJava() {
        System.out.println("Learn Java with Chu An @_@");
    }

    public int getAge() {
        return 25;
    }
}
