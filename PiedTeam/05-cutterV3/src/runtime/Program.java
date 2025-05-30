package runtime;
//now, t muốn quản lý không chỉ là 1 hình chữ nhật
//tao còn muốn quản lý hình vuông, hình tròn, tam giác (vuông)
//nhiêm vụ: là tạo ra iên kết cha con cho bọn này thì mới về chung 1 nhà
import data.Shape;
import data.Disk;
import data.Rectangle;
import data.Square;

public class Program {
    public static void main(String[] args) {
        //tạo mang để lưu dc hình tròn, vuông, hcn
        Shape ds[] = new Shape[5];
        ds[0] = new Disk("Tía", "Purple", 2);
        ds[1] = new Rectangle("Hường", "Pink", 2, 3);
        ds[2] = new Square("Sáu", "Green", 5);
        Disk d = new Disk("Lam", "Blue", 5);
        ds[3] = d;
        //mảng này còn 1 chỗ trống nữa nha
        //Muốn có object thi ta phải làm gi?
        //cái khuôn
        //cái phễu(contructor- new Phễu)
        //biến con trỏ = new Phễu(...);
        //Dog chiquaqua = new Dog(?,?,?)
        //nếu ta có object từ class con thì sao? như nhau
        //Square sq = new Square(?,?,?)
        //tạo cái gì cx cần khuôn, phễu, biến con trỏ
        
        /*
            Tuy nhiên nếu nhìn sào sâu bên trong vùng nhớ thi vùng nhớ cua con
            sẽ co vùng new Cha
        mục đích: 
            giúp cho thk con có tất cả nhưng gì mà cha có
            bản thân thk con và thk cha co thể sống đọc lập
            nhưng để có thể nhận cha con và về chung 1 nhà thì con
            phải đem ra những điểm chung cho cha
            nên kế thừa cx là lúc nó khôi phục lại những gì đã đưa cha
        =>Không cần làm lại những gì mà nguoi khác đã làm tốt r nhá
        Object con nếu nhìn vao vùng nhơ sẽ là
        Square sq = new Square();
                            new Rectangle() + code của rieng con
        thk con chính là: new Cha  + code cua riêng con
                                    super
                                    di truyền       extends(vùng biến dị)
                                    inherit
        Vậy nếu thk cha là abs class thì sao?
        thi thk con = new Cha + code riêng con + code cho abs method của cha
        bản thân abs class k tạo đc object 
        nó cần class trung gian (cho 1 class con vá lỗi dùm và tạo object)
        nhưng đôi khi mình lười, mình k thích đi qua class trung gian, hoặc 
        k biết đặt tên là gì, nhưng biết no là 1 dạng Shape
        thì a có thể dùng abstract dể đúc object thông qua kỹ thuật
        Anonymours / mượn gió bẻ măng
        
        bình thường 1 abs class không tạo đc object
        phải tìm 1 class con kế thừa và vá thủng để dựa đo tạo objetct
        ưu điểm: nhân bản dc
        nhược điểm: quá trình tạo khuôn mất thời gian, phải đặt tên có thể tạo 
        trực tiếp object thông qua abs class trung gian
        anonymous:
            ưu điểm: nhanh, k cần tạo class trung gian, khỏi đặt tên
            nhược điểm: tạo bằng tay, khó nhân bản, muon nhân bản phải copy 
            phải trùng lappj code
        //dùng anonymous khi nào
            khi em muốn tạo object bằng abs class mà k thông qua class trung 
            gian , em có đối tượng bt là Shape nhưng k bt rõ là gì
        */      
        
        
        
        Shape xxx = new Shape("Bé Na", "7color") {
            @Override
            public double getPerimeter() {
                return 50;
            }
            
            @Override
            public double getArea() {
                return 15;
            }
            
            @Override
            public void paint() {
                String str = String.format("%15s|%10s|%10s|%5.2f|%5.2f|"
                        , "XXX", owner, color
                        , getPerimeter(), getArea());
                System.out.println(str);
            }
        };
        ds[4] = xxx;
        //in ra danh sach
        for (Shape item : ds) {
            item.paint();
        }
        //Drift: parse type: ép kiểu
        Rectangle r1 = new Rectangle("r1", "Pink", 10, 23);
        Square s1 = new Square("s1", "Tím", 5);
        r1.paint();
        s1.paint();
        //hv laf hcn, trong lúc tạo hình chu nhat, ngta new hvuong
        //có hay k? được
        Rectangle r2 = new Square("r2", "Vàng", 20);
        //ép kiểu c1
        Square tmp = (Square)r2;
        tmp.drawTextTitle();
        //ép kiểu c2(nên dùng)
        ((Square)r2).drawTextTitle();
        r2.paint();
        //nếu mà mình khai cha và new con thì 
        //object vẫn chạm đc vao các hàm mà con dã độ, nhưng k chạm đc các
        //hàm của riêng con, dù bên trong có sỡ hữu
        //muốn chạm vào thì phải dùng ép kiểu
    }
}
