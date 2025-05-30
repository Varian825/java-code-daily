
package data;

import java.util.Random;

/*
    Khi thì k có props riêng gì so với cha, nhưng khả năng tiếp thu của loài khỉ
là 70%
*/
public class Monkey extends Herbivore{
    public static final double RECEPTIVE = 70;

    public Monkey(String name, int yob, double weight) {
        super(name, yob, weight);
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
        String str = String.format("%10s|%-20s|%4d|%6.2f|%6.2f",
                "Monkey", name, yob, weight, Study());
        System.out.println(str);
    }
     
}
