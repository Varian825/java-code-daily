
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import ui.Menu;
import utils.Inputter;

/*
BrandLIst: thằng quản lý danh sách các brand
 */
public class BrandList {
    ArrayList<Brand> brandList = new ArrayList<>();
    //những method giúp handle danh sách
    
    public boolean loadFromFile(String url){
        File f = new File(url);
        try{
            //handle file
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();//đọc 1 dòng trước
            while(line != null){
                StringTokenizer st = new StringTokenizer(line, ",");
                String brandID = st.nextToken().trim();
                String brandName = st.nextToken().trim();
                String str = st.nextToken().trim();//str là soundBrand: price
                //hash stage 2
                st = new StringTokenizer(str, ":");
                String soundBrand = st.nextToken().trim();
                double price = Double.parseDouble(st.nextToken().trim());
                //tạo brand từ những thông tin thu đc
                Brand nBrand = new Brand(brandID, brandName, soundBrand, price);
                brandList.add(nBrand);//thêm vào danh sách
                line = reader.readLine();//đọc dòng tiếp theo
            }
            //handle file
            return true;
        }catch(Exception e){
            System.out.println("File brands error: "+ e);
            return false;
        }
    }
    
    //hàm in ra danh sách
    public void listBrands(){
        if(brandList.isEmpty()){
            System.out.println("Brand list nothing to print");
            return;//ngừng luôn
        }
        System.out.println("____BrandList____"); 
        for (Brand brand : brandList) {
            System.out.println(brand);//tự động .toString()
        }
   }
    
    //hàm tìm kiếm
    public int searchID (String bID){
        for(int i = 0; i <= brandList.size() - 1; i++){
            if(brandList.get(i).getBrandID().equals(bID)){
                return i;
            }
        }
        return -1;
    }
    
    //thêm brand
    public void addBrand(){
        //gather data
        //id cấm trùng
        boolean isDup;
        String id;
        do{
            isDup = false;//reset mỗi lần nhập
            id = Inputter.getString("Input brannd id: ",
                    "that field is required");//nhập mã muốn xài
            //timfm xem mã này có ai xài chưa? nếu có là bị trùng
            int pos = searchID(id);//tìm vị trí, nếu != -1 là tìm đc => bị trùng
            if(pos != -1){
                System.out.println("This brand id has been used");
                isDup = true;
            }
        }while(isDup);
        //name, sound, price
        String name = Inputter.getString("Input brandName: ", "that field is required");
        String sound = Inputter.getString("Input soundBrand: ", "that field is required");
        
        //price là số nguyên dương
        double price = Inputter.getADouble("Input price: ", "price must to positive number", 
                                            0, Math.pow(2, 53) - 1);
        //tạo brand và lưu vào
        Brand nBrand = new Brand(id, name, sound, price);
        brandList.add(nBrand);
        System.out.println("Brand adding is successful");
    }
    
    //update Brand
    public void updateBrand(){
        //gather keyId của brand mà user muốn tìm để update
        String keyId = Inputter.getString("Input Brand id you wanna update: ", "that field is required");
        //dùng keyId thu dc tìm vị trí xem có k?
        int pos = searchID(keyId);
        Brand brand = pos == -1 ? null : brandList.get(pos);//lấy ra brand tròn List
        if(brand == null){//nếu k có brand thì
            System.out.println("Not found"); 
       }else{//nếu có thif cập nhật
            System.out.println("Brand information before updating");
            System.out.println(brand);//toString
            System.out.println("updating...");
            //thu thập giá trị mới
            String name = Inputter.getString("Input brandName: ", "that field is required");
            String sound = Inputter.getString("Input soundBrand: ", "that field is required");
        
            //price là số nguyên dương
            double price = Inputter.getADouble("Input price: ", "price must to positive number", 
                                            0, Math.pow(2, 53) - 1);
            //set giá trị mới vào brand
            brand.setBrandName(name);
            brand.setSoundBrand(sound);
            brand.setPrice(price);
            //thông báo
            System.out.println("Updating is successful");
        }
    }
    
    public void searchBrand(){
        //gather keyId của brand mà user muốn tìm để update
        String keyId = Inputter.getString("Input Brand id you wanna find: ", "that field is required");
        //dùng keyId thu dc tìm vị trí xem có k?
        int pos = searchID(keyId);
        Brand brand = pos == -1 ? null : brandList.get(pos);//lấy ra brand tròn List
        if(brand == null){//nếu k có brand thì
            System.out.println("Not found"); 
       }else{//nếu có thif cập nhật
            System.out.println("Brand information ");
            System.out.println(brand);//toString
        }
    }
    //hàm hiển thị MEnu danh sách các brandList đẻ user chọn lựa
    public Brand getUserChoice(){
        Menu menuBrand = new Menu("<----BrandListMenu----<3");
        return menuBrand.ref_getChoice(brandList);
    }
    
    //hàm save file
    public boolean saveToFile(String url){
        File f = new File(url);
        try{
            //handle file
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f));
            for (Brand brand : brandList) {
                writer.write(brand.toString());//.toString()
                writer.write("\n");
            }
            writer.flush();
            return true;
        }catch(Exception e){
            System.out.println("Save Brand File Error " + e);
            return false;
        }
    }
    
}
