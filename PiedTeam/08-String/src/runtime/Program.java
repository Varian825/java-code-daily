
package runtime;

import java.util.StringTokenizer;

public class Program {
    public static void main(String[] args) {
        String lastName = new String("AnChu");
        //giờ ta sẽ tạo tmp tham chiếu tới lastName
        String tmp = lastName;//2 chàng trỏ 2 nàng
        String firstName = "Lê";//pool
        //String trong java và các ngôn ngư khác(trừ c, ...)
        //String dc xem là Immutable, bất kỳ thao tác nào lên String dều k làm 
        //String bị thay đổi, mà sẽ tạo ra String mới
        
        //lastName.concat(firstName);//nối nhưng nó k thay đổi lastName 
        //mà nó trả về string kết quả sau nối 
        //nếu trả về kết quả, muốn dùng thì phải hứng
        lastName = lastName.concat(firstName);
        System.out.println("Tên nè: " + lastName);
        System.out.println("tmp nè " + tmp);//AnChu
        
        /*StringBuilder và StringBuffer là muterble class
            Mutable cố nghĩa là chuỗi luu trong 2 object này co thể vị thay đổi
            thông qua hàm
        */
        StringBuilder lastName2 = new StringBuilder("Điệp");
        StringBuilder tmp2 = lastName2;
        StringBuilder firstName2 = new StringBuilder("Lê");
        lastName2.append(firstName2);//nối giống concat
        System.out.println("Tên nè: " + lastName2);//"ĐiệpLê"
        System.out.println("tmp2 nè " + tmp2);//"ĐiệpLê"
        //StringTokenizer - hash - băm - split
        String information = "SE194268|AnChu|2005|10";
        StringTokenizer st = new StringTokenizer(information, "|");
        
        System.out.println(st.countTokens());
        System.out.println(st.hasMoreTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());//băm và trả ra khúc vừa băm
        }
        
        System.out.println(st.countTokens());//0
        System.out.println(st.hasMoreTokens());//false
        System.out.println(information);//vẫn còn vì String lad immutable k thay
        //đổi được
        
        //checkStringMethod();//gọi hàm
        playWWithStringComparision();
    }
    public static void checkStringMethod(){
        //String là immutable, nên mỗi lần dùng method nào của String
        //bạn hãy nhớ để ý đầu ra của method đso
        String str1 = "Anchu";
        String str2 = "Deptroai";
        //str1.concat(str2);//vô nghĩa
        str1 = str1.concat(str2).concat("Quá").toUpperCase();
        //nếu trả ra object thì co thẻ chấm tiếp
        System.out.println("str1 nè " + str1);
        
        //tìm chuỗi trong chuỗi
        str1 = "AnChu dep trơ";
        str2 = "dep";
        //hỏi location của str2 nằm ở đâu trong str1?
        System.out.println(str1.indexOf(str2));//6
        //tìm ký tự ở vị trí cho trước
        System.out.println(str1.charAt(10));//t
        //có tồn tại hay k?
        System.out.println(str1.contains(str2));//true
                
    }
    
    public static void playWWithStringComparision(){
        String s0 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        String s1 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s2 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s3 = "bé hứa học hành chăm ngoan";//pool
        String s4 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        String s5 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
        System.out.println(s0 == s1);//false
        System.out.println(s1 == s2);//true vì cùng cơ chế pool
        System.out.println(s1 == s3);//false vì cái viết hoa, cái viết thường
        System.out.println(s1 == s4);//false
        System.out.println(s1 == s5);//false
        System.out.println(s2 == s3);//false
        System.out.println(s2 == s5);//false
        //muốn so sánh s1 và s2 phải làm sao ?
        System.out.println(s1==s2);//chỉ đang so sánh địa chỉ
        //vì k có auto unboxing nào cả
        System.out.println(s1.equals(s2));//lúc này so giá trị
        //s1.equalsIgnoreCase(s2);//so sánh k xem hoa thường
        
        //hiểu dc sự tương tác của pool và immutable???
    }
}
