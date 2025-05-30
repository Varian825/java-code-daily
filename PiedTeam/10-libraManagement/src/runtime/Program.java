
package runtime;

import data.Author;
import data.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Author> auList = new ArrayList<>();
        ArrayList<Book> boList = new ArrayList<>();
        
        initData(auList, boList);
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            System.out.println("Vui lòng nhập lựa chọn: ");
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1: {
                    System.out.println("Thêm thông tin 1 cuốc sách");
                    Book newBook = new Book();
                    newBook.inputInfor();//nameBook, createAt, nickName
                    //tìm xem tác giả ccuae cuốc sách có trong danh sách chưa
                    boolean isFind = false;
                    for (Author author : auList) {
                        if(author.getNickName().equals(newBook.getNickName())){
                            isFind = true;
                        }
                    }
                    //nếu có thì thôi đỡ tạo 
                    if(!isFind){
                        //nếu k co thì tạo
                        Author newAuthor = new Author(newBook.getNickName());
                        newAuthor.inputInfor();//chỉ nhập name và yob
                        auList.add(newAuthor);
                    }
                    //sau tất cả thì cũng phải add sách mới vào
                    boList.add(newBook);
                    break;
                }
                case 2: {
                    for (Book book : boList) {
                        book.showInfor();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Thêm tác giả mới");
                    Author newAuthor = new Author();
                    newAuthor.inputInfor(auList);//nhập full thông tin, co check
                    auList.add(newAuthor);
                    break;
                }
                case 4: {
                    System.out.println("Tìm sách của tác giả");
                    System.out.println("Nhập bút danh của tác giả muốn tìm");
                    String key = sc.nextLine();//nhập nickname của tác giả
                    //chạy hết danh sách các cuốn sách thì in2
                    boolean isFind = false;
                    for (Book book : boList) {
                        if(book.getNickName().equals(key)){
                            book.showInfor();
                            isFind = true;
                        }
                    }
                    if(!isFind) System.out.println("K có cuốn sách nào");
                    break;
                }
                case 5: {
                    System.out.println("Hẹn gặp lại");
                    break;
                }
                default: {
                    System.out.println("Chỉ đưoc từ 1- 5 thòi");
                    break;
                }
            }
        }while(choose != 5);

    }
    //hàm tự thêm data vào mảng: hàm nhận vao mảng và nhét data vào
    public static void initData(ArrayList<Author> auList,
                                ArrayList<Book> boList){
        //nạp data cho AuthorList
        auList.add(new Author("Ngo Kien Huy", "Huy quan hoa", 1999));
        auList.add(new Author("Nguyen Thuy Chi", "ChiPu", 1994));
        auList.add(new Author("Le Ho Diep", "UncleTen", 1999));
        
        //Nạp data cho sách
        boList.add(new Book("Mãi mãi là xa lắm", "6-4-2024", "Huy quan hoa"));
        boList.add(new Book("Dung lam moi thu phuc tam", "12-4-2024", "ChiPu"));
        boList.add(new Book("Cach lay 10 điểm cực chilll", "16-4-2024", "UncleTen"));
    }
    //hàm in
    public static void showMenu(){
        System.out.println("---QUẢN LÝ THƯ VIỆN---");
        System.out.println("1.Nhập thông tin sách in ra màn hình");
        System.out.println("2.Hiển thị thông tin sách ra màn hình");
        System.out.println("3.Nhập thông tin tác giả");
        System.out.println("4.Tìm kiếm sách theo bút danh");
        System.out.println("5.Thoát");
    }
    
}

/*
tạo chương trình quản lý thư viện
gồm 2 class sau
Author
    name nickname birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho,ép nhập lại
    tạo hàm showInfor
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát
*/
