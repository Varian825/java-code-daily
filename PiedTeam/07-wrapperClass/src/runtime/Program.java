
package runtime;


public class Program {   
    public static void main(String[] args) {
        int a = 8;//primitive, 4byte trong thanh ram sẽ cấp vùng nhớ 4 byte
        //dùng để lưu con int
        //vây thì a cso "chấm" dk? không
        // a. cái đầu mày
        //nhưng ta có thể lưu 1 số nguyên thông qua 1 class đặc biệt tên Integer
        Integer b = new Integer(8);
        //lấy 1 class tên Integer(core = 8);
        //new Integer(8) là tạo ra 1 vùng luu ở heap
        //và vùng này rất lớn
        //1 biến con trỏ tên là b (stack) trỏ vao vùng nhớ ở heap
        //anh sẽ k kuyến khích em tạo số nguyên bằng cách này
        //vì nó tốn rất nhiều năng lượng
        // hành động nay là : gói 1 con int bằng 8 vào 1 object => boxing
        //boxing xảy ra khi Integer = primitive
        //=> nhét primitive vao 1 object dc tạo từ wrapper class
        System.out.println("a ne " + a);
        System.out.println("b nè " + b);//auto unboxing
        System.out.println("b nè " + b.toString());//k cần .toString thì 
            //máy tính tự động chấm cho mình nên dùng auto unboxing
        //tên ma: gọi thầm tên em (auto unboxing)
        int c = b;// primitive = Integer => auto unboxing
        //mở cái hộp Integer, lấy cái core(lõi) là 8 và em gán vào biến c
        //còn nếu k có auto unboxing là em gán cho biến c địa chỉ
        //c. cái đầu mày
        //wrapper class = primitive gọi là boxing
        //primitive = wrapper class gọi là auto unboxing
        //ngoai việc viết wrapper class  = new Wrapper class
        Integer d = 2000;//khỏi cần dùng new Integer()
        //boxing gói con 2000 vào 1 object 
        //xài bth
        System.out.println("d nè " + d);//2000 //auto unboxing
        System.out.println("Sum = " + (a + d));
        
        d = 2000;//wrapper class
        b = 2000;//wrapper class
        a = 2000;//primitive
        if(d.compareTo(b) == 0){
            System.out.println("Bằng nhau");
        }else{
            System.out.println("Khác nhau");
        }
        //res: khác nhau vì đang so địa chỉ với nhau
        //Nếu so sánh 2 primitive thi nó so sánh gía trị dùng '=='
        //Nếu so sanh wrapper và primitive dùng '==' là đủ (auto unboxing)
        //Nếu so sánh wrapper và wrapper thì dùng '==' sẽ so đại chỉ
            //phải dung method .equal() hoặc .compareTo()
    }   
}
