package data;

import java.util.Scanner;


public class Person {
    //props
    private String name;
    private String gender;
    private int yob;
    //constructor đầy đủ
    public Person(String name, String gender, int yob) {
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }
    //overload
    //constructor rỗng
    public Person() {
    }
    //constructor rỗng sẽ co nếu như class k co constructor nào cả
    //nếu như class có 1 constructor thì constructor default sẽ mất phải tạo lại
    
    //getter

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getYob() {
        return yob;
    }
    
    //hàm này giúp người dùng nhập giá trị cho object Person
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);//thợ nhập
        //nhập name
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();//nhập chuỗi
        //nhập gender
        System.out.println("Nhập giới tính: ");
        this.gender = sc.nextLine();
        //nhập yob
        System.out.println("Nhập năm sinh: ");
        this.yob = sc.nextInt();          
        
    }
    public void showInfor(){
        String str = String.format("%s|%s|%d|", name, gender, yob);
        System.out.printf(str);
    }
    
}
/*
Person class
    bao gồm: name, gender, yob
    co phễu co  đối số, và k có đổi số
    có getter và k có setter
    method showInfor
    method nhập thôgn tin ngươi dùng
*/

