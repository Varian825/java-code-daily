/*
    Cái class này là 1 cái khuôn chuyên dùng để đúc ra object là tam giác
 */
package data;

public class Triangle {
    //properties(props)
    protected double edgeA;
    protected double edgeB;
    protected double edgeC;
    //double perimeter = edgeA + edgeB + edgeC;
        //không tạo thuộc tính diện tích và chu vi
        //1. nêu mình tạo nó mình sẽ cần getter và setter
        //  =>setter để đổi giá trị
        //2. diện tích và chu vi có thể tính đc bằng 3 cạnh trên
        //mình k nên lưu những prop mà mình có thể tự tính đc 
        //mình sẽ làm getter để dùng công thức tính ra nó
    //method
        //constructor: cái phểu

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }
    //getter và setter

    public double getEdgeA() {
        return edgeA;
    }
    public double getEdgeB() {
        return edgeB;
    }
    public double getEdgeC() {
        return edgeC;
    }
    //giúp tính chu vi
    public double getPerimeter() {
        return edgeA + edgeB + edgeC;
    }
    public double getArea() {
        double p = this.getPerimeter() / 2;//p là nữa chu vi
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }
    
    //method: showInFor
    public void showInFor(){
        String str = String.format("|Triangle     |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f|",
                edgeA, edgeB, edgeC, getArea(), getPerimeter());
        System.out.println(str);
    }
}
