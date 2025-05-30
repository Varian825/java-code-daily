
package data;

//Square là con của Rectangle và cháu của Shape
//Rectangle làm hết rồi nên Square hưởng thôi
public class Square extends Rectangle {

   
    //có điểm riêng k? không vì edge là width và height r
    //tạo phễu
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }
    @Override
    public void paint() {        
        String str = String.format("%15s|%10s|%10s|%5.2f|%5.2f|%5.2f|%5.2f|"
                , "SQUARE", owner, color, width, height
                , getPerimeter(), getArea());
        System.out.println(str);
    }
    
    public void drawTextTitle() {
        System.out.println("ahihi you stupid");
    }
}
