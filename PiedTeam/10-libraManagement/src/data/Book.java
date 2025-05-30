
package data;

import java.util.Scanner;

public class Book {
    //props
    private String bookName;
    private String createAt;
    private String nickName;
    //constructor
    //phễu rỗng
    public Book() {
    }
    
    //phễu đầy đủ
    public Book(String bookName, String createAt, String nickName) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickName = nickName;
    }
    
    //getter
    public String getBookName() {
        return bookName;
    }
    public String getCreateAt() {
        return createAt;
    }
    public String getNickName() {
        return nickName;
    }
    //tạo hàm inputInfor
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.bookName = sc.nextLine();
        
        System.out.println("Ngày tạo sách: ");
        this.createAt = sc.nextLine();
        
        System.out.println("Nhập bút danh của tác giả: ");
        this.nickName = sc.nextLine();
    }
    
    //hàm showInfor
    public void showInfor(){
        System.out.printf("%-20s|%-20s|%-20s\n", bookName, nickName, createAt);
    }
        
    
    
}
/*
    Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
*/