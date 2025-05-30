
package data;





public class Cat extends Pet {   // extends ko phải kế thừa mà là mở rộng 
    private String ribbon; // vòng cổ 
    // contructors

    public Cat(String id, String owner, String color, 
            double weight,String ribbon) {
        super(id, owner, color, weight);
        this.ribbon = ribbon;
    }
    //getter

    public String getRibbon() {
        return ribbon;
    }
    //setter

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }
    
    @Override
    public void showInfor() {
        String str = String.format("%4s|%-15s|%-15s|%6.2f|%s", 
                id, owner,color, weight,ribbon);
        System.out.println(str);// in ra cái chuỗi đẹp
    }
    // độ lại toString 

    @Override
    public String toString() {
        String str = String.format("%4s|%-15s|%-15s|%6.2f|%s", 
                id, owner,color, weight,ribbon);
        return str; //trả ra cái chuỗi đẹp bên ngoài tùy ý sử dụng 
    }
    
    
}