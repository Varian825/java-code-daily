/*

 */
package data;
//TrightTriangle là class(khuôn) đúc ra các hình tam giác vuông(object)
//tự nhiên đang code giữa chừng em nhận ra tam giác
//có huyết thống với nhau
//vậy ai là cha, ai là con
//cha con là mối quan hệ "is - a"
//Triangle is a rightTriangle (sai)
//RightTriangle is a Triangle (đúng)
//    con              cha 
//xác định cha con thông qua "is - a"
//và trong trường hợp này thì RightTriangle là con của Triangle
//vì Triangle có góc vuông sẽ thành RightTriangle
//***tại sao tôi phải nhận cha
//1-Những gì mà cha đã làm tốt r thì mình nên thừa hưởng và xài thôi
//đừng code lại làm gì mệt

//extends: mở rộng
//RightTriangle extends Triangle:
//RightTriangle là phiên bản mở rộng Triangle
public class RightTriangle extends Triangle{
    //liệt kê những prop mà em có, cha k có 
    //tạo phễu: constructor
    //super: bề trên: new Triangle: gọi cái phễu của tam giác
    public RightTriangle(double edgeA, double edgeB){
       super(edgeA, edgeB, Math.sqrt(edgeA*edgeA + edgeB*edgeB));
    }
    //getter và setter?
    @Override
    public void showInFor(){
        String str = String.format("|RightTriangle   |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f|",
                                edgeA, edgeB, edgeC, getArea(), getPerimeter());
        System.out.println(str);
    }
}
