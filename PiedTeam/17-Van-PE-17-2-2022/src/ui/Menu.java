package ui;

import data.Brand;
import java.util.ArrayList;
import utils.Inputter;

/*
menu là 1 cái khuôn chuyên đúc ra anh quản lý danh sách các lựa chọn 
anh này có: danh sách các lựa chọn  optionList <String>
anh này có: tên của menu 'title'
anh này có : các method giúp xử lý menu 
  + addNewOption : thêm mới các option vào danh sách optionList 
  + print: in ra danh sách optionList : kèm số kế bên cho người dùng 
  + getChoice : thu thập lựa chọn từ người dùng 

*/
public class Menu {
    //mảng lưu option trong menu
    public ArrayList<String> optionList = new ArrayList<>();
    public String title ;// tên của menu
     //contructor

    public Menu(String title) {
        this.title = title;
    }
    //addNewoption: thêm mới 1 option vào optionList 
    public void addnewoption(String newOption){
        optionList.add(newOption);
    }
    //printf : in ra danh sách optionList kèm số
    public void print(){
       int count  = 1;
        System.out.println("_____"+title+"_____");
        for (String op : optionList) {
            System.out.println(count + "." + op);
            count++;
        }
    }
    //getchoice thu nhập lựu chọn của người dùng 
    public int getChoice(){
        int choice = Inputter.getAnInteger("Input your choice", 
                "Your choice must between 1 and "+optionList.size(), 
                1, optionList.size());
        return choice;
    }
    
    //Hàm nhận vào danh sách các brand(brandlist)
    //Hiển thị danh sách kèm số kế bên để người dùng chọn lựa
    //cho phép chọn và return ra đối tượng họ đã chọn
    public Brand ref_getChoice(ArrayList<Brand> brandList){
        //in ra danh sách brandList(các dòng xe)
        int count = 1;
        for (Brand brand : brandList) {
            System.out.println(count + "." + brand);//toString
            count++;
       }
        //mời nhập
        int choice = Inputter.getAnInteger("Input SEQ of Brand: ",
                                    "SEQ must be between 1 and " + brandList.size(),
                                    1, brandList.size());
        //sau khi có lựa chọn thì return Brand tương ứng ra ngoài
        return brandList.get(choice - 1);
    }
}
