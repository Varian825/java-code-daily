
package data;
//Horse đc xem là động vật ăn cỏ Herbivore
//khi mà Horse kế thừa Herbivore nghĩa là nó đang lấy lại những gì đã cho cha giữ

//ngựa đang bth, nhưng ngựa tham gia clb này thi ngựa sẽ ham học
//tham gia vao đây, ngựa đuọc gi?
//ngựa sẽ k nhận được thuộc tính nào cả
//ngăuj sẽ nhận được 2 lỗ thủng(abs method)
//nhiêm vụ là vá lỗ(implements)
import java.util.Random;

public class Horse extends Herbivore implements StudyEnthusiasts{
    //props của riêng con
    private String colorSaddle;
    //con ngựa vừa học vừa hu hí nên là khả năng tiếp thu rất kém
    public static final double RECEPTIVE = 30;//độ tiếp thu là 30%
    
    //constructor
    public Horse(String name, int yob, double weight, String colorSaddle) {
        super(name, yob, weight);
        this.colorSaddle = colorSaddle;
    }//super: new Herbivore(new cha) => (name, yob, weight)
    
    //getter
    public String getColorSaddle() {
        return colorSaddle;
    }

    @Override
    public double Study() {
        //vá lỗ thủng study vi ngựa học hú hí, tiếp thu khá kém, nên dù học như nào 
        //cũng khó qua 30 điểm
        return new Random().nextDouble() * RECEPTIVE;
    }

    @Override
    public void showLearningOutcomes() {
        //show ra kết qua học tập cho đẹp, dối với ngựa thi phải show thêm yên ngựa
        //cùng điểm mới đẹp
        String str = String.format("%10s|%-20s|%4d|%6.2f|%6.2f|%s",
                "Horse", name, yob, weight, Study(), colorSaddle);
        System.out.println(str);
    }

    @Override
    public double studyHard() {
        return Study() * 2.5;
    }

    @Override
    public void showProfile() {
        String str = String.format("%10s|%-20s|%4d|%6.2f|%6.2f|%s",
                "Horse", name, yob, weight, studyHard(), colorSaddle);
        System.out.println(str);
    }
    
    
    
}
