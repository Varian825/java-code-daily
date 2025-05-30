/*
    là anh muốn quản lý những hình vuông và hình chữ nhật
*/
package runtime;

import data.Disk;
import data.Rectangle;
import data.Square;


public class Program {
    public static void main(String[] args){
        Rectangle re1 = new Rectangle("Tím", 2, 5);
        Square sq1 = new Square("Đỏ", 3);
        Rectangle sq2 = new Square("Cam", 5);
        //Khai cha new con là bth
        //Khai con new cha là bất thường
        //Square rq3 = new Rectangle("Đen", 2, 5);
        Rectangle ds[] = new Rectangle[3];
        ds[0] = sq1;
        ds[1] = re1;
        ds[2] = sq2;
//      for(int i = 0; i <= ds.length - 1; i++){
//            ds[i].paint();
//      }
        for (Rectangle item : ds){
            item.paint();           
        }
        Disk d1 = new Disk("Vàng", 3);
        //new Disk là gọi cai phễu của Disk
        //sau đó truyền dữ liệu (nguyên liêu cái phễu đó)
        //cái phễu dùng dữ liệu truyền vào các ngăn(prop) của cái khuôn
        //d1 sẽ trỏ vào đối tượng dc tạo ra từ new Disk đó
        d1.paint();
        //anh muốn luu hình tròn cùng với hình chư nhật luôn
        //tạo danh sách
        Rectangle list[] = new Rectangle[5];
        list[0] = re1;
        list[1] = sq1;
        //list[2] = d1;
        //d1 là 1 hình tròn nên k về cùng nhà với bọn Rectangle dc
    }
    
}
