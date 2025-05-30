
package data;


public class Dog extends Pet {   // extends ko phải kế thừa mà là mở rộng 
    private String necklace; // vòng cổ 
    // contructors

    public Dog(String id, String owner, String color, 
            double weight,String necklace) {
        super(id, owner, color, weight);
        this.necklace = necklace;
    }
    //getter

    public String getNecklace() {
        return necklace;
    }
    //setter

    public void setNecklace(String necklace) {
        this.necklace = necklace;
    }
    
    @Override
    public void showInfor() {
        String str = String.format("%4s|%-15s|%-15s|%6.2f|%s", 
                id, owner,color, weight,necklace);
        System.out.println(str);// in ra cái chuỗi đẹp
    }
    // độ lại toString 

    @Override
    public String toString() {
        String str = String.format("%4s|%-15s|%-15s|%6.2f|%s", 
                id, owner,color, weight,necklace);
        return str; //trả ra cái chuỗi đẹp bên ngoài tùy ý sử dụng 
    }
    
    
}
