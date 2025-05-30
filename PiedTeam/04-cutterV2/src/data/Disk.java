
package data;
//Disk là class(cái khuôn) dùng để đúc ra các oblect tròn
//hình tròn nao cx tạo ra từ cái khuôm này

public class Disk {
    private String color;
    private double radius;//bán kính
    public static final double PI = 3.14;
    //phễu

    public Disk(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
 
    //getter 
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    //getter cho diện tích
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
    //getter cho chu vi
    public double getPerimeter() {
        return PI * radius * 2;
    }
    //paint 
    public void paint() {
        String str;
        str = String.format("Disk     |%10s|%5.2f|%5.2f|%5.2f|",
                color, radius, getArea(), getPerimeter());
        System.out.println(str);
    }
}
