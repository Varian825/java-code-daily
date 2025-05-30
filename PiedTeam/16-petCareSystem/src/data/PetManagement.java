
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import utils.Inputter;

/*
PetManagement : là 1 cái khuôn dùng để đúc ra 1 anh 'quản lí danh sách thú cưng'
anh này sẽ nắm giữ danh sách thú cưng 
anh này còn có các method giúp thao tác với danh sách thú cưng 
CRUD(create read update delete)  cần thêm xóa sửa thì gọi anh này , k đc code 
trên main nữa 
    1. Thêm mới 1 con cún
    2. Thêm mới 1 con mèo
    3. in ra danh sách thú cưng // done
    4. tìm kiếm thú cưng theo tên
    5. update thú cưng theo id
    6. remove thú cưng theo id
    7. sắp xếp thú cưng theo trọng lượng
    8. save file and quit
*/
public class PetManagement {
    //props 
    ArrayList<Pet>petList = new ArrayList<>(); // danh sách thú cưng 
    
    //method giúp xử lí cái danh sách trên thôi 
    //initData: giúp e nạp giá trị cho petList để test code
    public void iniData(){
        petList.add(new Dog("D001","Tuấn", "red", 6.5, "I <3 U"));
        petList.add(new Dog("D002","Toàn", "YếLau", 2.5, "Yellow"));
        petList.add(new Cat("C001","Tùng", "Nâu", 4.2, "Mỹ Diệu"));
        petList.add(new Cat("C002","Thông", "Tím", 5.2, "Thông tìm"));
    }
    //showPetList: in ra các con vật trong danh sách 
    public void showPetList(){
        if(petList.isEmpty()){
            System.out.println("Nothing to print");
            return;//ngừng  luôn, k đọc nữa 
        }
        // còn nếu k rỗng thì 
        System.out.println("_____PETLIST____");
        for (Pet item : petList) {
            item.showInfor();
        }
    }
    //sortPetListByWeight:  sắp xếp danh sách theo cân nặng 
    public void sortPetListByWeight(){
        //1. tạo ra anh trọng tài
        Comparator orderByWeight = new Comparator<Pet>() {
            @Override
            public int compare(Pet t1, Pet t2) {
                 return t1.getWeight() > t2.getWeight() ? 1 : -1;
                   }
              };
        //2.cài đặt anh trong tài vào danh sách 
        Collections.sort(petList,orderByWeight);
        }
    
    
     // + nhận vào id và trả ra vị trí 
    public int searchPetIndexById(String keyId){ // mã cần tìm
        for(int i = 0; i <= petList.size()-1 ;i++){
            if(petList.get(i).getId().equals(keyId)){
                return i;
            }
        }
        return -1;
    }
    
    
     // + nhận vào id và trả ra object(Pet)
     public  Pet searchPetById(String keyId){ //keyId: là mã pet cần tìm 
         int pos = searchPetIndexById(keyId); // dựa vào id tìm vị trí 
          return pos == -1 ? null : petList.get(pos); // null ko có trả ra con pet ở vị trí đã tìm đc 
     }
     
     
     //+ xin id và trả ra object(Pet)  // thg này là mối quan hệ overload thằng trên nhưng khác biến thể method // đi xin tìm rồi tự in
     public void searchPetById(){
         String keyId = Inputter.getString("Input PetId you wanna find: ", 
                                           "that field is required");
         //dùng keyId để tìm pet
         Pet pet = searchPetById(keyId); // tìm pet dựa vào id
         if(pet == null){
             System.out.println("The pet not exist");
         }else{
             System.out.println("The pet information");
             pet.showInfor();// lấy con pet tìm đc show thông tin 
         }
     }      
      //+ xin id và xóa con pet khỏi danh sách
     public void removePetById(){
         String keyId = Inputter.getString("Input PetId you wanna remove: ", 
                                           "that field is required");
         //dùng keyId để tìm pet
         Pet pet = searchPetById(keyId); // tìm pet dựa vào id
         // thông báo
         if(pet == null){
             System.out.println("The pet not exist");
         }else{
             System.out.println("The pet information");
             pet.showInfor();// lấy con pet tìm đc show thông tin 
             petList.remove(pet);
             System.out.println("Removing is successful");
         }
     }   
     
     //+ xin id và cập nhật thông tin con pet khỏi danh sách
     public void updatePetById(){
         String keyId = Inputter.getString("Input PetId you wanna update: ", 
                                           "that field is required");
         //dùng keyId để tìm pet
         Pet pet = searchPetById(keyId); // tìm pet dựa vào id
         // thông báo
         if(pet == null){
             System.out.println("The pet not exist");
         }else{
             System.out.println("The pet information before updating");
             pet.showInfor();// lấy con pet tìm đc show thông tin 
             //tiến hành cập nhập con pet
             System.out.println("updating....");
             //, owner, color, weight
             String newOwner = Inputter.getString("Input Owner: ", 
                                                 "That field is required!");
             String newColor = Inputter.getString("Input color: ", 
                                 "That field is required");
             double newWeight = Inputter.getADouble("Input weight", 
                                  "That field is required",1,100);
             // nếu pet là chó thì phải necklace
             //còn nếu là mèo thì phải ribbon
             pet.setOwner(newOwner);
             pet.setColor(newColor);
             pet.setWeight(newWeight);
             
             //nếu pet là chó thì phải necklace
             //nếu pet là mèo thì phải ribbon
             if(pet instanceof Dog){ // nếu là bản thể của con chó thì vô 
                  String newNecklace = Inputter.getString("Input necklace: ", 
                                                 "That field is required!");
                  ((Dog)pet).setNecklace((newNecklace));
             }else{
                 String newRibbon = Inputter.getString("Input ribbon: ", 
                                                 "That field is required!");
                  ((Cat)pet).setRibbon((newRibbon));
             }
             System.out.println("Updating is successful");
         }
     }   
    //addNewDog : thêm mới 1 con chó 
     public void addNewDog(){
         //thu nhập thông tin từ người dùng id,owner, color , weight, necklace 
         boolean isDup;
         String id;
         do{
            isDup = false; // ban đầu tin ko trùng 
            id = Inputter.getString("Input your Dog's id: ",  
                                     "Your id isn't matches DXXX!!!", 
                                     "[dD]\\d{3}").toUpperCase();// lưu chữ hoa
            Pet pet  = searchPetById(id);// tìm xem có ko
            if(pet != null){
                isDup = true;
                System.out.println("This id had been used!!! ");
            }
         }while(isDup); // còn trùng thì còn nhập lại 
         
            String owner = Inputter.getString("Input Owner: ", 
                                                 "That field is required!");
            String color = Inputter.getString("Input color: ", 
                                 "That field is required");
            double weight = Inputter.getADouble("Input weight", 
                                  "That field is required",1,100);
             String necklace = Inputter.getString("Input necklace: ", 
                                                 "That field is required!");
          //bỏ vào khuôn đúc luôn 
         Dog nDog = new Dog(id, owner, color, weight,necklace);
         petList.add(nDog); 
         System.out.println("Adding is successful");
     }
     public void addNewCat(){
         //thu nhập thông tin từ người dùng id,owner, color , weight, necklace 
         boolean isDup;
         String id;
         do{
            isDup = false; // ban đầu tin ko trùng 
            id = Inputter.getString("Input your Cat's id: ",  
                                     "Your id isn't matches DXXX!!!", 
                                     "[cC]\\d{3}").toUpperCase();// lưu chữ hoa
            Pet pet  = searchPetById(id);// tìm xem có ko
            if(pet != null){
                isDup = true;
                System.out.println("This id had been used!!! ");
            }
         }while(isDup); // còn trùng thì còn nhập lại 
         
            String owner = Inputter.getString("Input Owner: ", 
                                                 "That field is required!");
            String color = Inputter.getString("Input color: ", 
                                 "That field is required");
            double  weight = Inputter.getADouble("Input weight", 
                                  "That field is required",1,100);
             String ribbon= Inputter.getString("Input necklace: ", 
                                                 "That field is required!");
          //bỏ vào khuôn đúc luôn 
         Cat nCat = new Cat(id, owner, color, weight,ribbon);
         petList.add(nCat); 
         System.out.println("Adding is successful");
     }
     //method đọc file
     //hàm nhận vào đường dẫn đến file cần đọc ,đọc và trả ra true|false
     public boolean ladFromFile(String url){
         petList.clear(); // xóa sạch petList trước khi nạp giá trị từ file
         //từ url tạo object file
         File f = new File(url); // dùng url tạo file
         try{
             //xử lý file
             //dùng bufferedReader để đọc từng hàng trong f
             BufferedReader reader = new BufferedReader(new FileReader(f));
             String line = reader.readLine();
             while(line != null){ // còn dòng thì còn xử lí
                 // xử lý 1 line thành object và lưu vào 
                 StringTokenizer st = new StringTokenizer(line,"|");
                 String id = st.nextToken().trim();
                 String owner = st.nextToken().trim();
                 String color = st.nextToken().trim();
                 double weight = Double.parseDouble(st.nextToken().trim());
                 String special = st.nextToken().trim(); // chưa rõ là gì , biết là String thôi
                 
                 Pet pet;
                 if(id.matches("[dD]\\d{3}")){
                     pet = new Dog(id,owner,color,weight,special);
                 }else{
                     pet = new Cat(id,owner,color,weight,special);
                 }
                 petList.add(pet);
                 line = reader.readLine();
             }
             //xử lý file
             
             return true;
             
         }catch(Exception e){
             System.out.println("File lỗi rồi");
             return false;
         }
     }
}
