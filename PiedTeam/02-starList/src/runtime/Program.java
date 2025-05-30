
package runtime;
//trong 1 file Java: chỉ dc có 1 class public thôi, và class đó 
//phải cùng tên với file

import data.Star;

public class Program {
    public static void main(String[] args){
        Star mtp = new Star("Nguyễn Thanh Tùng", 1994, "Nam", 
                            "Cơn Mưa Ngang Qua");
        //new Star là gọi cái phễu Star
        mtp.showInFor();
        
        Star chipuC = new Star("ChiPuc", 1993, "Nữ", "Chiếc Ố");
        chipuC.showInFor();
        //bây giờ muốn lấy riêng tuổi của Sơn Tùng ra xem
        System.out.println("mtp có tuổi là " + mtp.yob);
        mtp.yob = 1999;//set lại giá trị yob của anh mtp
        System.out.println("mpt có tuổi là " + mtp.yob);
        //xem(get) tên của mtp
        System.out.println("Tên của mtp nè: " + mtp.getName());
        mtp.setName("Truong Van An", 571994);//set giá trị của name lại
        System.out.println("Tên của mtp ne: " + mtp.getName());
        
        //Một nagyf nọ anh đi bơi
        Star ngocTrinh = new Star("Trần Thị Ngọc Trinh", 1989, "Nữ", "Eo56");
        ngocTrinh.showInFor();
        Star diep = new Star("Lee Hold Deep", 1999, "Nam", "Thich gõ code");
        diep.showInFor();
        ngocTrinh.showInFor();
    }
}

/* 
.)Modifier
    1 - Access Modifier
        +) public: phạm vi truy cập rộng nhất, chỉ cần gọi là được
                   ai cũng có thể nhìn thấy.
        +) private: riêng tư, phạm vi truy cập nhỏ nhất k ai nhìn thấy.
        +) default: giống public nhưng chỉ nhũng thằng chung package.
        +) protected: có thẻ truy cập trong và ngoài package, chỉ cho class con 
                      mới được dùng.
    ex: 
        pks runtime
            class Program
        pks data
            public class Student
            private class Car
            class Bike
    ex:
        class Ông Nội{
            protected Bà Nội;
    }
        class Cha{
            protected money = 1000;
    }
        class Con{

    }
    ông nội: thừa hưởng: deos có, có: bà nội.
    cha: thừa hưởng: bà nội, có: bà nội.
    con: thừa hưởng: bà nội, money, có: người yêu.
    () Tính bất hiếu: cha cho con hết những gì cha có còn con thì k có cho 
                      cha bất cứ cái gì.
    
    2 - Non-Access Modifier
        +) final(ap dung cho class, method, properties)
            class: nghĩa là nó không thể trở thành bố cua class khác dc.
            method: vẫn cho thừa kế, nhưng không dc override.
            properties: hằng số.
        +) static: tĩnh
                sử dụng chung cho tất cả các đối tượng tạo từ class
                class Student(name, yob, point, static nameRoom = "Diep")
        +) abstract: trừu tượng: class, method
                con người thích đặt tên cho những thứ họ k hiểu? Tình yêu.

    //ex: final là gì?
        class: có 2 cơ chế chính là tạo(đúc) ra object(đối tượng)
                có thể nhận 1 class khác làm con.
            [final class: nghĩa là em có tạo được object? có, nhưng em có 
                            đuọc làm cha của thằng khác k? không
            ]
        method: 
            Câu chuyện bán trà sữa:
            class Cha{
                protected method: nấu trà sữa(){
                    nấu cực ngon, bằng than tre
                }
            }
        //con thừa hưởng tất cả những gì cha có nhưng tới đời con thì người 
        tiêu dùng k quan tâm chât lượng nhiều bằng giá thành.
            class Con{
                @override
                protected method: nấu trà sữa(){
                    nấu cực ngon, đường hóa học
                }
            }
            OverRide: vượt mặt
    Lúc này em sẽ thấy là cùng hành động "nấu trà sữa" nhưng cách nấu của 
    thang con khác thang cha,  nó thừa hưởng và nó còn độ chế thêm vào cho hợp 
    thời của nó điều này gọi là override: vượt mặt | nó khác overwite.
    Vậy thì bố cũng "nấu trà sữa" nhưng khác với no vài năm sau, ổng 
    nổi hứng quay lại mở quán bán trà sữa ổng có nấu dc giống nó k? không 
    vì quy tắc bất hiếu.
    
    Ta có khái niệm: final method: có nghĩa là cho phép di truyền nhưng không
    được override.
    Có nghĩa là: nếu như ổng biết thang con độ chế đường hóa học, má toe, ổng
    k thich ổng để mothod của ổng là final method thì thằng con vẫn dc thừa 
    hưởng công thức nhưng thang con k bao giờ được quyền độ chế .
    
    Thuộc tính mà final: final properties thì gọi là hằng số.
                
*/