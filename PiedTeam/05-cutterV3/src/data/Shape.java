
package data;
/*
Shape đc xem là cái khuôn đc xem là cha của tất cả các hình học
 tròn đo bao gồm tròn, vuông, chữ nhật
nhưng nếu như bọn con muốn nhận Shape làm cha, thì chúng nó phải gom điểm chung
và cho cha giữ. để sau này khi bọn nó kế thừa cha thì sẽ đc khôi phục lại những
thuộc tính ban đầu.
*/
//Shape là cha thì nó chỉ dc chứa những điểm chung cua các con mà thôi
public abstract class Shape {
    protected String owner;//người đã căt cái hình đo
    protected String color;//màu cua cái hình đó
    //private Strinf radius;//hình vuông sẽ có bán kính(vl)

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }
    
    //getter
    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void paint();
    
        //tại sao k viết công thức tính chu vi ở đây?
        //vì k có công thức nào áp dụng cho cả hình tròn và hình vuông
        //nếu ta bỏ bat kỳ 1 công thức nao vào method nay thì các thk
        //con sẽ phải kế thừa, thì nó sẽ nhận lấy công thưc sai
        //=> cha áp dặt công thức lên các con, và cha k muón như v 
        //nên ổng chọn là k có công thức =>method này là abstract method
    
     
}
//=> Tại sao Shape là abstract class?
//   vì nó chứa abstract method
//=> Vậy sao nó phải chưá abstract method, nó k bỏ
//   vao 1 công thức đi vì k co công thức chung cho các người con. nếu bỏ vào 
//thì các người con sẽ bị áp đặt công thức, k đúng
//=>Vậy abstract class có tạo ra object dc k?
/*
    Abstract class giống như 1 cái khuôn bị thủng mà nếu như bị thủng thì k đúc
dc vì object dc tạo ra có method k định nghia dc, object k xài dc

Vậy abstract class cần làm gì? no cần 1 class khác kế thừa và vá lỗ thủng mà nó 
để lại
cần class khác kế thừa nó sau đo thừa hưởng những abstract method từ Shape, rồi
định nghĩa lại(vá lỗ) (getPerimeter, getArea, paint)

//Vạy nếu class khác sau khi kế thừa Shape lại k chịu định nghia các abstract 
method dc thừa kế thì?
//class con đó sẽ trở thành abstract class

abs class Shape
    abs method getPerimeter
    abs method getArea
    abs method paint

class Rectangle extends Shape
    abs method getPerimeter
    abs method getArea
    abs method paint

*/
