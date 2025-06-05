import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        //id have least 6d
        Pattern pattern = Pattern.compile("^\\d{6,}$");
        Matcher matcher = pattern.matcher("0123456789"); //true
//        Matcher matcher = pattern.matcher("0123456789a"); //false
        System.out.println("Input id have least 6d matches regex: " + matcher.matches());

        //id have 12d and start = 0
        Pattern pattern1 = Pattern.compile("^0\\d{11}$");
        Matcher matcher1 = pattern1.matcher("012345678910"); //true
//        Matcher matcher1 = pattern1.matcher("1123456789a"); //false
        System.out.println("Input id have 12d matches regex: " + matcher1.matches());

        //email
        Pattern pattern2 = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9]+\\.[a-z0-9]{2,6}$");
        Matcher matcher2 = pattern2.matcher("anchu@gmail.com"); //true
//        Matcher matcher = pattern.matcher("anchu@.c"); //false
        System.out.println("Input email matches regex: " + matcher2.matches());
    }
}
