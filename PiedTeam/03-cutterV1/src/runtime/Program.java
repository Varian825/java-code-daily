/*
    Bé Na học lớp 5, cô giáo dặn bé phải lưu trữ rất nhiều hình tam giác
*/
package runtime;

import data.RightTriangle;
import data.Triangle;


public class Program {
    public static void main(String[] args){
        Triangle tr1 = new Triangle(3, 7, 6);
        tr1.showInFor();
        //tao muốn tam giác vuông
        RightTriangle tr2 = new RightTriangle(3, 4);
        //new Triangle là đang gọi cai phễu Triangle
        tr2.showInFor();      
    }
}
