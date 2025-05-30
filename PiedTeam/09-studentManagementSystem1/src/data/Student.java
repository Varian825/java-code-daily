package data;

import java.util.Scanner;

public class Student extends Person {
    //props
    private String id;
    private float gpa;
    private String email;
    //constructor

    public Student(String name, String gender, int yob,
                   String id, float gpa, String email) {
        super(name, gender, yob);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }//super: new cha => new Person(name, gender, yob)
    
    public Student() {
    }
    
    //getter
    public String getId() {
        return id;
    }
    public float getGpa() {
        return gpa;
    }
    public String getEmail() {
        return email;
    }
    
    //setter intellegent
    //setter này thông minh ở chỗ là nó sẽ valid data trước khi
    //gán vào object, nếu mà giá trị invalid thì sẽ chửi và k cho
    //gán giá trị
    public boolean setId(String id) {
        if(id.length() == 0){
            System.err.println("Vui lòng điền thông tin");
            return false;
        }
        if(!id.matches("SE\\d{7}")){
            System.err.println("Id phải có dạng SEYYYYYYY với Y là số!");
            return false;
        }
        //nếu mà vượt qua hết cấc if trên thì
        this.id = id;
        return true;
    }
    public boolean setGpa(float gpa) {
        if(gpa < 0 || gpa > 10){
            System.err.println("GPA không hợp lệ!Vui lòng nhập lại nhé"); 
            return false;
        }
        this.gpa = gpa;
        return true;
    }
    public boolean setEmail(String email) {
        if(!email.contains("@")){
            System.err.println("Email không hợp lệ");
            return false;
        }
        this.email = email;
        return true;
    }
    @Override
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        super.inputInfor();//nhờ ba nhập giúp name, gender, yob
        //id
        /*
        while(true){
            System.out.println("Nhập StudentID: ");
            String inpID = sc.nextLine();
            boolean isValid = this.setId(inpID);
            if(isValid) break;
        }
        */
        //=>
        System.out.println("Nhập StudentID: ");
        while(!setId(sc.nextLine()));
        
        //gpa
        System.out.println("Nhập GPA: ");
        while(!setGpa(Float.parseFloat(sc.nextLine())));
        
        //email
        System.out.println("Nhập Email: ");
        while(!setEmail(sc.nextLine()));
       
    }   
    public void showInfor(){
        super.showInfor();//in ra name gender yob nhưng chưa xuống dòng
        String str = String.format("%s|%f|%s|\n", id, gpa, email);
        System.out.printf(str);
    }
    public boolean isScholarship(){
        return this.getGpa() > 8;
    }
}
/*
Student class
    sử dụng kế thừa để có đc name, gender, yob của person
    riêng Student thì muốn có thêm id, gpa, email
    phễu có đối số, và k có đối số
    getter và k có setter
    showInfor
*/
