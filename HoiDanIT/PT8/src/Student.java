public class Student extends Person{
    private int mark;
    private String grade;

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setGrade() {
        if(mark >= 8){
            this.grade = "A";
        }else if (this.mark >= 7 && this.mark < 8) {
            this.grade = "B";
        }else if (this.mark >= 6 && this.mark < 7) {
            this.grade = "C";
        }else if (this.mark >= 5 && this.mark < 6) {
            this.grade = "D";
        }else if (this.mark < 5) {
            this.grade = "Tach Tach Tach )))";
        }
    }
}
