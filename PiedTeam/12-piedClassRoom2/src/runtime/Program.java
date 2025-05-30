
package runtime;

import data.StudyEnthusiasts;
import data.Herbivore;
import data.Horse;
import data.Hunter;
import data.Monkey;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("Abu", 1994, 30);
        Horse h1 = new Horse("Rarity", 2015, 9, "None");
        Herbivore h2 = new Horse("Roach", 1976, 45, "Grey");
        Hunter hun1 = new Hunter("Thợ săn vượn", 1999, 65, "Nỏ");
        
        ArrayList<StudyEnthusiasts> stuList = new ArrayList<>();
        stuList.add(h1);
        stuList.add((Horse)h2);//ép kiểu
        stuList.add(hun1);
        
        //Hôm nay ta đã nhìn tháy dự chăm học của mọi người
        //thì có 1 chú lười (sloth) đến lốp học. tưởng là học sinh mới nhưng hóa ra
        //là bạn học cũ, vì nó chính là con chùm kín mít
        
        //1. tạo con lười bằng Herbivore thì k lưu vao stuList(sai)
        //2. tạo class Sloth, và cho Sloth gia nhập StudyEnthusiasts
        //  rồi dùng sloth tạo ra con lười
        //  tất cả cấc con lười đều sẽ ham học
        //  Class sloth mà implement StudyEnthusiasts thì lười nào cũng ham học
        //[oke] nhưng phi logic
        
        //3. dùng anonymours cho chính interface StudyEnthusiasts
        StudyEnthusiasts xxx = new StudyEnthusiasts() {
            @Override
            public double studyHard() {
                return 80 * 1.5;
            }

            @Override
            public void showProfile() {
                String str = String.format("%-20s|%-20s|%4d|%6.2f|%6.2f", 
                        "Sloth", "Flash", 2019, 120f, studyHard());
                System.out.println(str);
            }
        };
        
    }
    
}
