
package data;

//là cái khuôn chuyên dùng để đúc ra các hình vuông

public class Square extends Rectangle{
    //liệt kê những prop mà con có, cha k có 
    //thêm constructor

    public Square(String color, double edge) {
        super(color, edge, edge);
    }
    //super là bề trên: new Cha, new Rectangle
    @Override
    public void paint(){
        String str = String.format("Square   |%10s|%5.2f|%5.2f|%5.2f|%5.2f|",
                color, height, width, getPerimeter(), getArea());
        System.out.println(str);
    }
    
}

//ta có 2 class cha và con 
// => class con kế thừa class cha 
//=> class con có hết tất cả những gì mà cha có
//class con có những thuộc tính riêng và method riêng
//trong constructor của con thì nó có gọi super(construtor của cha)
//=> muốn tạo con thì phải tạo cha trước
//=>trong con có cha
//=>con lớn hơn cha

//Override: chỉ xuất hiện trong mối quan hệ "is - a" mà thôi(kế thừa cha con)
//khi mà thag con muốn độ lại 1 hàm(method) của cha
//nó tạo ra 1 method  cùng tên với method trước đó của cha
//cùng tên, cùng hoặc parameter, khác body

//Overload: không quan tâm mối quan hệ
//khi mà method này trùng tên mothod khác và phải khác parameter