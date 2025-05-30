
package data;

import java.util.Random;

/*
    Bác thợ săn k liên quan đến bọn ăn cỏ cả
*/
public class Hunter {
    //props
    private String name;
    private int yob;
    private double weight;
    private String gear;
    //vì mãi mê ngắm nhìn "phò mã" mà hunter ngắm nhìn rất mất tập trung 
    public static final double RECEPTIVE = 50;
    //cons
    public Hunter(String name, int yob, double weight, String gear) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.gear = gear;
    }
    //method
    public double Study() {
        //vá lỗ thủng study vi ngựa học hú hí, tiếp thu khá kém, nên dù học như nào 
        //cũng khó qua 30 điểm
        return new Random().nextDouble() * RECEPTIVE;
    }

    
    public void showLearningOutcomes() {
        //show ra kết qua học tập cho đẹp, dối với ngựa thi phải show thêm yên bác
        //cùng điểm mới đẹp
        String str = String.format("%10s|%-20s|%4d|%6.2f|%6.2f|%s",
                "Hunter", name, yob, weight, Study(), gear);
        System.out.println(str);
    }
    
}
