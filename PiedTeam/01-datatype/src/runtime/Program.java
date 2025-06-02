package runtime;

//import jdk.nashorn.internal.objects.NativeRegExp;

public class Program {

    public static void main(String[] args) {
        //comment: ghi chú
        //Java có 2 dạng dữ liệu
        //1. Primitive datatype:
        //DN: kiểu dữ liệu nguyên thủy.
        //dùng 1 lượng nhỏ bộ nhớ để biểu diễn giá trị.
        //nó đã rất nhỏ rồi không thể chia nhỏ ra nữa.
        //convention: cammelCase: cú pháp con lạc đà
        //8 kiểu:
        // 1 - byte    (1byte): số nguyên rất rất nhỏ.
        //-+127 do lúc đầu 256(gồm cộng và trừ)
        //nên khi đó còn 1 byte  = 7 bit(8)
        // 2 - short   (2byte): số nguyên rất nhỏ.
        // 3 - int     (4byte): số nguyên nhỏ.
        // 4 - long    (8byte): số nguyên lớn.
        // 5 - float   (4byte): số thực.
        // 6 - double  (8byte): số thực lớn.
        // 7 - char    (2byte): ký tự có dấu - unicode
        // 8 - boolean (1bit) : true | false

        char c = 65; //'A'
        System.out.println("Biến C chứa" + c);//line new
        System.out.printf("Biến C chứa %c", c);
        //ta có kiểu dữ liệu mới là byte
        //byte là số nguyên cực nhỏ
        // -128 -> 127
        byte numByte = 127;
        System.out.println("numByte nè" + numByte);

        int numInt = 12345;
        float numFloat = 123.45F;
        //đối với số thực, java ưu tiên hiểu là double
        float numF; //? 0.0F
        double numDouble = 123.45;
        //numInt = numByte;
        //numByte = numInt;
        //không thể nhét cái gì quá nhỏ vào 1 cái gì quá nhỏ, hiểu ý tôi k

        //2. Object datatype | references datatype
        //DN: Kiểu dữ liệu do người dùng tự định nghĩa (mô tả)
        //mô tả từ các primitive datatype
        //tạo ra kiểu dữ liệu mới Student (yob-int, name-char-String, mark-float)
        //haking primitive
        long numLong = 10_000_000_000L;//thêm _ cho an toàn (về tiền)
        //prefix: tiền tố
        int num1 = 0xFA; //0x: hex
        num1 = 076; //0: octal
        //Operator: toán tử
        //trong java có ít nhất 10 loại toán tử
        //Arithmetic: toán tử toán hạng
        //+ - * / % ++ --
        //+= -= *= /= %=
        int a = 10;
        int b = a++ - ++a + --a - a--;
        System.out.println(b);
        //Assiment: phép gán
        b = a;
        //comparision: phép so sánh
        //> < >= <= == !=

        //Logic: And(&&) Or(||)
        // & và |
        //&&: tìm false
        //||: tìm true
        //toán tử 3 ngôi
        int numA = 2;
        int numB = 5;
        int numC = numA > numB ? 7 : 9;//numC: 9

        //String
        //comma: phẩy
        //Unari: 1 ngôi
        //Relational: toán tử quan hệ
        //Shift bit: dịch bit
        // >> <<
        //đẩy xuống thì rớt | đẩy vào thì bù 0
        int numE = 8;
        numE = numE << 2;
        //x >> n => x/(2^n)
        //x << n => x*(2^n)
        System.out.println(numE);//0000100
        //bitwise: toán tử bit (& | ^ ~)
        //&: giống phép nhân
        //|: tìm 1
        //^: 2 số khác nhau thì 1, giống nhau thì 0
        //~: phủ định
    }
}
