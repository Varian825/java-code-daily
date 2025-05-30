
package data;
//Rectangle là cái khuôn chuyên dùng để đúc ra các hình chữ nhật

import java.util.logging.Logger;

public class Rectangle {
    //props
    protected String color;
    protected double height;
    protected double width;
    //constructor

    public Rectangle(String color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    //getter 

    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public double getArea() {
        return width * height;
    }
    
    //method paint: vẽ ra thôi
    public void paint(){
        String str = String.format("Rectangle|%10s|%5.2f|%5.2f|%5.2f|%5.2f|",
                color, width, height, getPerimeter(), getArea());
        System.out.println(str);
    }
    
    
    
}
