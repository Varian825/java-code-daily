/*
1 byte java có thẻ chứa rất nhiều class nhưng chỉ có 1 class đuoc public mà thôi
class pulic đo phải cùng tên với file

*/
package runtime;

public class Program {

    public static void main(String[] args) {
        //dùng anonymours để tạo object tử Interface Human
        Human diep = () -> {
            System.out.println("agashjagd");
        };
        diep.show();
        Math m1 = (int a, int b) -> {
            return a + b;
        };
        m1.sum(2, 5);
    }
    class A{}
}
class B{}
//Class A là innerClass của class Program
//Class B là outterClass của class Program
@FunctionalInterface
interface Human{
    public void show();
    //public void showAhihi();
}

interface Math{
    public int sum(int a, int b);
}
//lambda chi xuất hiện sau phiên bản SE8
//Nhiệm vụ lớn nhất của lambda là tạo object từ interface nhanh hơn anonymours
//giúp code ít hơn
