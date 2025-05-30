import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] clubs = {1, 7, 4, 9, 13, 2};

        for (int i = 0; i < clubs.length - 1; i++) {
            for (int j = i + 1; j < clubs.length; j++) {
                if (clubs[i] < clubs[j]) {
                    int tmp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(clubs));


//        System.out.println("Run here array " + Arrays.toString(clubs));
//        System.out.println("Run here array with length " + clubs.length);
//        System.out.println("Run here array: first element = " + clubs[0]);
//        System.out.println("Run here array: second element = " + clubs[1]);
//        System.out.println("Run here array: third element = " + clubs[2]);
//        System.out.println("Run here array: a = " + a[0]);
    }
}
