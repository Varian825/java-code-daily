
package data;
//Disk là con của Shape 
//nếu nhận Shape làm cha thì nó phải thua hưởng 
//1 đống abstract method và có nhiệm vụ vá lỗ nếu k thì 
//nó sẽ trở thành abs class
//__cách nhận cha
//0.Tạo class con
//1.Khai báo đặt tính của riêng con
//2.Cho con nhận cha thông qua từ khóa "extends"
//3.Tạo phễu
//4.Làm phần việc mà cha giao cho nếu có
//           là bổ sung code chi những abs method
//           nếu mà k chịu làm thi m sẽ là abs class và dời con m phải làm
//      vậy nếu cha tôi k có abs method nao thì thôi?
//      kiếm xem có cái nao độ chế thi độ chế
public class Disk extends Shape {
    private  double radius;
    public static final double PI = 3.14;
    //tạo phễu

    public Disk(String owner, String color, double radius) {
        super(owner, color);
        this.radius = radius;
    }
    //getter

    public double getRadius() {
        return radius;
    }
    //vá lỗ

    @Override
    public double getPerimeter() {
        
        return 2 * radius * PI;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void paint() {
        String str = String.format("%15s|%10s|%10s|%5.2f|%5.2f|%5.2f|%5.2f|" 
                , "DISK", owner, color, radius, PI
                , getPerimeter(), getArea());
        System.out.println(str);
    }
    
    
    
    
    
    
}

