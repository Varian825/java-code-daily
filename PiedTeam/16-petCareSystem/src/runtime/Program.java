
package runtime;

import data.PetManagement;
import data.Pet;
import java.util.Scanner;
import ui.Menu;
import utils.Inputter;

public class Program {
    public static void main(String[] args) {
        //test code
        // tạo ra anh quản lý danh sách thú cưng 
        PetManagement pm = new PetManagement();
        // trong pm đang có gì ? 1 danh sách thú cưng rỗng 
        // 2 method : inidata và showInfor
        String url ="C:\\K19JavaF1\\16-petCareSystem\\petListDoc.txt";
        pm.ladFromFile(url);
         // pm.iniData(); // nạp giá trị vào       
        // 1 mảng lưu 8 chuỗi 
        Menu menu = new Menu("Pet care system");
        menu.addnewoption("Add new dog");
        menu.addnewoption("Add new cat");
        menu.addnewoption("print pet list");
        menu.addnewoption("search pet by id");
        menu.addnewoption("update pet by id");
        menu.addnewoption("remove pet by id");
        menu.addnewoption("sort pet order by weight");
        menu.addnewoption("save file and quit");
        while(true){
            menu.print();//hiển thị
            int choice = menu.getChoice();
            switch(choice){
                case 1:{
                    pm.addNewDog();
                    
                    break;
                    
                }
                case 2:{
                    pm.addNewCat();
                    break;
                    
                }
                case 3:{
                    pm.showPetList();
                    break;
                    
                }
                case 4:{
                    pm.searchPetById();
                    break;
                    
                }
                case 5:{
                    pm.updatePetById();
                    break;
                }
                case 6:{
                    pm.removePetById();
                    break;
                }
                case 7:{
                    pm.sortPetListByWeight();
                    break;                  
                }
                case 8:{
                    System.out.println("See u again");
                    return ;//kết thúc
                }
            }
        }
    }
    
}
/*
Viết 1 chương trình quản lý thú cưng (DOG | CAT)
    1. Thêm mới 1 con cún
    2. Thêm mới 1 con mèo
    3. in ra danh sách thú cưng
    4. tìm kiếm thú cưng theo tên
        + nhận vào id và trả ra vị trí 
        + nhận vào id và trả ra object(Pet)
        + xin id và trả ra object(Pet)
    5. update thú cưng theo id
    6. remove thú cưng theo id
    7. sắp xếp thú cưng theo trọng lượng
    8. save file and quit

    khi thêm mới id của pet k được trùng với id ở trong danh sách
    id của pet phải thỏa theo format "D001| C001"
    một con Pet có nhửng thuộc tính owner , color, weight
    
    Dog: necklace
    Cat: ribbon

    yêu cầu chung: nhập chuẩn | nhập bậy bạ là chữi
*/
/*
 pm.sortPetListByWeight(); // rồi hãy in ra nhé
        pm.showPetList();
        // test hàm nhận vào id, tìm vị trí 
        int pos = pm.searchPetIndexById("D0003");
        System.out.println(pos);
        ///test hàm nhận vào id , tìm ra con pet
        //Pet pet = pm.searchPetById("D0001");
        //System.out.println(pet); // tự động gọi toString nên tự in ra 
        
        //Cần nhập tuổi 
        
        //int age = sc.nextInt(); // nhược điểm của hàm nhập :nextInt  12\n:sẽ có enter trôi lệnh
        // nhập 1 chuỗi vd nhập 12/n đc ép qua 12
        // dủng try catch bắt ỗi
        int age = Inputter.getAnInteger("Nhâp tuổi đi: ", 
                            "Tuổi là số nguyên  nha mày",1,100);
        int yob = Inputter.getAnInteger("Nhập năm sinh",  
                            "Mày không bik nhập số nguyên hả");
        System.out.println("Tuổi nè: "+age);
        System.out.println("Năm sinh nè: "+yob);
        
*/