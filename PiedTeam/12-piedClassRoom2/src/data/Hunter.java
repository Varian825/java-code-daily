
package data;

import java.util.Random;

/*
    Muốn Hunter tập trung cao độ cho việc học, bác hunter là 1 thành viên của
clb ham hịc, để bác thừa hưởng sự ham học
*/
public class Hunter implements StudyEnthusiasts{
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

    @Override
    public double studyHard() {
        return Study() * 1.5;
    }

    @Override
        public void showProfile() {
            String str = String.format("%10s|%-20s|%4d|%6.2f|%6.2f|%s",
                "Hunter", name, yob, weight, studyHard(), gear);
            System.out.println(str);
        }
    
}
