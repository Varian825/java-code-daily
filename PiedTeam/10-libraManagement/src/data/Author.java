
package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    //props: ngăn
    private String name;
    private String nickName;
    private int yob;
    
    //constructor
    public Author() {//method inputInfor() xin đầy đủ thông tin
    }
    
    //phễu đầy đủ thì k cần hàm nhập
    public Author(String name, String nickName, int yob) {
        this.name = name;
        this.nickName = nickName;
        this.yob = yob;
    }
    
    //phễu chỉ cần nickname => inputInfor() nhập vào 2 props còn lại
    public Author(String nickName) {
        this.nickName = nickName;
    }
    //getter

    public String getName() {
        return name;
    }
    public String getNickName() {
        return nickName;
    }
    public int getYob() {
        return yob;
    }
    
    //hàm nhập name và yob cho tác giả
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        //nhập name
        System.out.println("Nhập tên tác giả: ");
        this.name = sc.nextLine();
        //nhập yob
        System.out.println("Nhập năm sinh của tác giả: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    
    //hàm nhập thông tin cho tác giả mới
    public void inputInfor(ArrayList<Author> authorList){
        Scanner sc = new Scanner(System.in);
        //nickname: kiểm tra xem danh sách tác giả, ai có nickname này chưa
        System.out.println("Nhập bút danh(nickname): ");
        while(true){
            String inpNickName = sc.nextLine();//mời nhập 1 nickname muôn tạo
            boolean isFind = false;
            //kiểm tra xem cso ai trong danh sách dùng nickname nay chưa
            for (Author author : authorList) {
                if(author.getNickName().equals(inpNickName)){
                    isFind = true;
                }
            }
            if(isFind){
                System.out.println("Nickname đã có người sử dụng");
            }else{
                this.nickName = inpNickName;
                this.inputInfor();//nhập name và yob
                break;
            }
        }
    }
    public void showInfor(){
        System.out.printf("%-20s|%-20s|%4d\n", name, nickName, yob);
    }
}
/*
    Author
    name nickname birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho, ép nhập lại
    tạo hàm showInfor
*/