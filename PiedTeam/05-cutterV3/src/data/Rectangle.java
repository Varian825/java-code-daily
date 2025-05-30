package data;
//Rectangle là con của Shape 
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
public class Rectangle extends Shape {
    protected double width;
    protected double height;
    //tạo phễu

    public Rectangle(String owner, String color, 
                    double width, double height) {
        super(owner, color);
        this.width = width;
        this.height = height;
    }
    //super: new Cha => new Shape(Owner, color)
    //super phải là câu lệnh đầu tiên trong cái phễu
    //cha phải có trước r mới có con

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    

    @Override
    public double getPerimeter() {
        return (width + height)*2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void paint() {      
        String str = String.format("%15s|%10s|%10s|%5.2f|%5.2f|%5.2f|%5.2f|"
                , "RECTANGLE", owner, color, width, height
                , getPerimeter(), getArea());
        System.out.println(str);
    }
    
}
