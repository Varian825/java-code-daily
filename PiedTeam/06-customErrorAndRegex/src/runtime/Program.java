
package runtime;

import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) {
        //I. Regex là gì?
            //Regex| regular expression | pattern | biểu thức chính quy
            //Mẫu chuẩn cho String
            //Cách dùng
            String str = "SE1234567";
            String regex1 = "^[Ss][Ee]\\d{7}";
            System.out.println(str.matches(regex1));
            //học viết
            //1. ký tự cố định
            checkString("name", "name");//true
            checkString("nAme", "name");//false
            //2. Không phân biệt hoa thường
            checkString("nAme", "(?i)name");//true
                //key: (?i)
            //Metcharacter symbol
            //
            //3. 1 ký tự bất kì "."
            checkString("m0y", "m.y");//true
            //true: may mey m9y my
            //false: meey
            //4. lập lại kí tự trước đo từ 0 đến nhiều lần: "*"
            checkString("mmmmmy", "m*y");
            //my mmmmy y  | true
            //m mymy | false
            checkString("merêrererey", "m(er)*y");
            //mery mrery mererererery | true
            //mey mry | false
            checkString("mahfhsdkjhfds13y", "m.*y");
            //giữa m và y có gì cũng đc trừ enter
            //5. được quyền xuat hiện hoặc k: "?"
            checkString("may", "mar?y");
            //may mary | true
            //marry my | false
            
    //mẹo ma: ma{0,1}y // lấy trong khoản đó
    
        //II. Regex character set(tập giá trị)
            //1. phần tử bất kì trong set[...]
            checkString("may", "m[aer]y");
            //may mey mry | true
            //m9y muy mem | false
            checkString("may", "m[aer]y");
            //may mey mry | false
            //m9y muy mem | true
            //2. khớp các chữ cái trong dãy
            //[a-z]: 1 ký tự từ a-z
            //[A-Z]: 1 ký tự từ A-Z
            //[a-zA-Z]: 1 ký tự từ a-z hoặc A-Z
            
            //3. khớp số
            //[0-9]: 1 ký tự từ 0-9
            //4. Giới hạn ký tự : {start, end}
            //{3}: bắt buộc lập lại 3 lần
            //{2, }: bắt buộc 2 lần trở lên
            //{2, 4}: bắt buộc 2 tới 4 lần
            //* => {0, }
            //? => {0, 1}
            //+ => {1, }
            //5. gom nhóm ()
            //6. hoặc | kết hợp ()
            //"toi (co|ko|bla) bi gay
                //toi co bi gay
                //toi ko bi gay
                //toi bla bi gay
        //III. shorthand: viết tắt
            //1. \w: [a-zA-z0-9]        \W: [^a-zA-z0-9]
            //2. \d: [0-9]              \D: k phải số
            //3. \s: dấu cách           \S: k chấp nhận dấu space
        
            //I-------TryCath-------
                //error compilayion: lỗi trong quá trính biên dịch
                //error runtime: lỗi phát sinh trong quá trình chạy code
                
                //Scanner: người chuyên đảm nhiệm các proclem về gán, nhập giá trị
                Scanner sc = new Scanner(System.in);
                //anh này sẽ nhận giá trị từ hệ thống(tay) truyền vô
                int age = 0;
                try{
                    System.out.println("Nhập tuối đi: ");
                    age = sc.nextInt();
                    if(age < 10 || age > 30){
                        throw new Exception();//tao tự nép, xong tự chụp luôn
                    }
                }catch(Exception e){
                    System.out.println("Mày phải nhập số nguyen chứ???");
                }finally{
                    //làm 1 cái gì đo sau cùng
                    System.out.println("Ahihhi:))");
                    //vô ích vì có cx v, k có cx v
                }
                System.out.println("Ahihhi");
                
            
            
    }
    //method giúp mình check
    public static void checkString(String str, String regex){
        System.out.println(str.matches(regex));
    }
    
}
