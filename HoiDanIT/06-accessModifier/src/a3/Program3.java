package a3;

import a1.Lesson;
import a1.Program;

public class Program3 extends Lesson {
    private void test(){
        Lesson les1 = new Lesson();
        les1.a = 10;
//        les1.b = 10;
        ((Program3)les1).c = 10;
//        les1.d = 10;
    }
    public static void main(String[] args) {

    }
}
