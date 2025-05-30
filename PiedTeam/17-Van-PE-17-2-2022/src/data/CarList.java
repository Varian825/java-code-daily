/*
CarList: anh quản lý ds các chiếc xe
Anh quản lý các chiếc xe có:
    + danh sách các chiếc xe
    + anh quản lý các brand: thì ảnh lại có danh sách các brand
 */
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;
import utils.Inputter;

public class CarList {
    //danh sách các chiếc xe mà ảnh quản lý
    ArrayList<Cars> carList = new ArrayList<>();
    BrandList brandList;
    //cons
    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }
    
    //hàm đọc file
    public boolean loadFromFile(String url){
        File f = new File(url);
        try{
            //handle file
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while(line != null){
                //handle dòng
                StringTokenizer st = new StringTokenizer(line, ",");
                String carID = st.nextToken().trim();
                String BrandID = st.nextToken().trim();
                String color = st.nextToken().trim();
                String frameID = st.nextToken().trim();
                String engineID = st.nextToken().trim();
                //dùng brandID tìm brand thi mới tạo đưuọc
                int pos = brandList.searchID(BrandID);
                Brand brand = brandList.brandList.get(pos);
                //tạo
                Cars nCar = new Cars(carID, brand, color, frameID, engineID);
                carList.add(nCar);
                line = reader.readLine();
            }
            //xong thì
            return true;
        }catch(Exception e){
            System.out.println("Car file err: " + e);
            return false;
        }
    }
    //hàm in
    public void listCars(){
        if(carList.isEmpty()){
            System.out.println("Car List has nothing to print");
            return;
        }
        //nếu có thì sắp xếp rồi in(kiểu đầy đủ - screenString)
        Collections.sort(carList);
        System.out.println("____CarList____");
        for (Cars cars : carList) {
            System.out.println(cars.screenString());
        }
    }
    
    //hàm tìm
    public int searchID(String keyId){
        for(int i = 0; i <= carList.size() - 1; i++){
            if(carList.get(i).getCarID().equals(keyId)){
            return i;
            }
        }
        return -1;
    }
    
    public int searchFrame(String keyFrame){
        for(int i = 0; i <= carList.size() - 1; i++){
            if(carList.get(i).getFrameID().equals(keyFrame)){
            return i;
            }
        }
        return -1;
    }
    
    public int searchEngine(String keyEngine){
        for(int i = 0; i <= carList.size() - 1; i++){
            if(carList.get(i).getEngineID().equals(keyEngine)){
            return i;
            }
        }
        return -1;
    }
    
    //thêm 1 chiếc xe
    public void addCar(){
        //thu thập 
        //id cấm trùng
        boolean isDup = false;
        String CarId;
        do{
            isDup = false;//reset niềm tin, tin rằng chưa bị trùng
            CarId = Inputter.getString("Input CarId: ",
                    "That field is required!!!");
            int pos = searchID(CarId);//seasrchId là của CarList
            if(pos != -1){//tìm đc -> bị trùng
                System.out.println("Car id has been used!!!");
                isDup = true;
            }
        }while(isDup);//còn trùng thì còn phải nhập lại
        //nhập brand
        Brand brand = brandList.getUserChoice();//hiển thị Menu để chọn brand
        //nhập color
        String color = Inputter.getString("Input color: ", 
                "That field is required!!!");
        //nhập FrameId cấm trùng và theo format
        String frameId;
        do{
            isDup = false;//reset niềm tin, tin rằng chưa bị trùng
            frameId = Inputter.getString("Input frameId: ",
                    "That frameId must be match F00000!!!", "F\\d{5}");
            int pos = searchFrame(frameId);//seasrchId là của CarList
            if(pos != -1){//tìm đc -> bị trùng
                System.out.println("frameId has been used!!!");
                isDup = true;
            }
        }while(isDup);//còn trùng thì còn phải nhập lại
        
        String EngineId;
        do{
            isDup = false;//reset niềm tin, tin rằng chưa bị trùng
            EngineId = Inputter.getString("Input EngineId: ",
                    "That EngineId must be match E00000!!!", "E\\d{5}");
            int pos = searchEngine(EngineId);//seasrchId là của CarList
            if(pos != -1){//tìm đc -> bị trùng
                System.out.println("EngineId has been used!!!");
                isDup = true;
            }
        }while(isDup);//còn trùng thì còn phải nhập lại
        
        //tạo
        Cars nCar = new Cars(CarId, brand, color, frameId, EngineId);
        carList.add(nCar);
        System.out.println("Car adding is successful");
    }
    
    //hàm in ds car dựa trên tên của dòng xe
    public void printBasedBrandName(){
        String key = Inputter.getString("Input a part of BrandName: ",
                "That field is required!!!");
        //duyệt hêt danh sách các chiếc xe
        //chiếc nào mà có brand có tên chứa key thì lụm
        int count = 0;
        for (Cars cars : carList) {
            if(cars.getBrand().getBrandName().contains(key)){
                System.out.println(cars.screenString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("No car is detected!");
        }
    }
    
    public boolean removeCar(){
        String keyId = Inputter.getString("Input carId you wanna remove: ",
                "That field is required!!!");
        //từ keyId tìm vị trí
        //từ vị trí lấy ra Car
        int pos = searchID(keyId);
        Cars car = pos == -1 ? null : carList.get(pos);
        if(car == null){
            System.out.println("Not found");
            return false;
        }else{
            System.out.println("Car infor before removing");
            System.out.println(car.screenString());
            System.out.println(pos);
            System.out.println("Car removing is successful");
            return true;
        }
    }
    
    //hàm update
    public boolean updateCar(){
        String keyId = Inputter.getString("Input carId you wanna update: ",
                "That field is required!!!");
        //từ keyId tìm vị trí
        //từ vị trí lấy ra Car
        int pos = searchID(keyId);
        Cars car = pos == -1 ? null : carList.get(pos);
        if(car == null){
            System.out.println("Not found");
            return false;
        }else{
            System.out.println("Car infor before updateing");
            System.out.println(car.screenString());
            //thu thập thông tin mới Brand, color, frameId, engineId
            boolean isDup;
            System.out.println("Updating...");
            //nhập brand
        Brand brand = brandList.getUserChoice();//hiển thị Menu để chọn brand
        //nhập color
        String color = Inputter.getString("Input color: ", 
                "That field is required!!!");
        //nhập FrameId cấm trùng và theo format
        String frameId;
        do{
            isDup = false;//reset niềm tin, tin rằng chưa bị trùng
            frameId = Inputter.getString("Input frameId: ",
                    "That frameId must be match F00000!!!", "F\\d{5}");
             pos = searchFrame(frameId);//seasrchId là của CarList
            if(pos != -1){//tìm đc -> bị trùng
                System.out.println("frameId has been used!!!");
                isDup = true;
            }
        }while(isDup);//còn trùng thì còn phải nhập lại
        
        String EngineId;
        do{
            isDup = false;//reset niềm tin, tin rằng chưa bị trùng
            EngineId = Inputter.getString("Input EngineId: ",
                    "That EngineId must be match E00000!!!", "E\\d{5}");
             pos = searchEngine(EngineId);//seasrchId là của CarList
            if(pos != -1){//tìm đc -> bị trùng
                System.out.println("EngineId has been used!!!");
                isDup = true;
            }
        }while(isDup);//còn trùng thì còn phải nhập lại
            car.setBrand(brand);
            car.setColor(color);
            car.setFrameID(frameId);
            car.setEngineID(EngineId);
            System.out.println("Car updating is successful"); 
           return true;
        }
    }
    //save file
    public boolean saveToFile(String url){
        File f = new File(url);
        try{
            //handle file
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f));
            for (Cars car : carList) {
                writer.write(car.toString());//.toString()
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
