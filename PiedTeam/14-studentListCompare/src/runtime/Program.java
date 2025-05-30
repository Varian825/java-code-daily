/*
    Muốn so sánh 2 object thì phai làm sao
    == : so sánh về địa chỉ
    epualTo(): boolean | compareTo(): int
    // wrapper va String thì mới dùng được
//có 2 sinh viên | cái cây | chú chim
    những đối tượng dạng trên đc moo tả rất nhiều thuộc tính nên rất khó 
để có thể nói rằng thằng nào hươn thằng nào ngay dc, phải cô s1 tiêu chí gì đó

comparator     và     comparable
anh trọng tài         tính đố kỵ
*/
package runtime;

import data.StudentV1;
import data.StudentV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {
        //sortV1();//call function
        sortV2();
    }
    
    public static void sortV1(){//create function
        //sortV1: mình sẽ sắp xếp danh sách các sinh viên 
        //bình thường, thông qua comparator(anh trọng tài), vì 
        //sinh viên bth sẽ k có tính đố kỵ
        ArrayList<StudentV1> stuList = new ArrayList<>();
        stuList.add(new StudentV1("SE00001", "Lê", "An", 8.2));
        stuList.add(new StudentV1("SE00002", "Nguyễn", "Bình", 7));
        stuList.add(new StudentV1("SE00003", "Lý", "Dũng", 9));
        stuList.add(new StudentV1("SE00004", "Trần", "Cường", 5));
        stuList.add(new StudentV1("SE00005", "Võ", "Em", 9.9));
        
        //giờ mình muốn sort, thì mình sẽ dùng comparator\
        //khi ta so sánh 2 đối tượng sinh viên trong danh sách
        //comparator là gì:
        //về mặt hiểu: là 1 người đúng ra xem xét 2 dối tượng
        //      và dựa vào 1 tiêu chí (mình đề ra) để so sánh
        
        //về mặt lý thuyết: comparator là 1 interface chi có 1 method
        //là compareTo(): đây là hàm so sánh 
        //mình se thêm "tiêu chí so sánh" vao trong body method compareTo
        //
        //c1: tạo ra 1 comparator trước, rồi  mình bỏ ảnh vào danh sách để ảnh sort dùm mình
        //tạo ra a trọng tài giúp mình so sánh 2 sinh viên theo id
        Comparator ordById = new Comparator<StudentV1>() {
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {
                if(t1.getId().compareTo(t2.getId()) > 0){
                    return 1;
                }
                return -1;
            }
        };
        //ordById laf 1 anh trọng tài, chuyên so sánh 2 sinh viên theo mã
        
        Collections.sort(stuList, ordById);
        for (StudentV1 item : stuList) {
            item.showInFor();
        }
        //cách 2: vừa sort vừa tạo comparator
        Collections.sort(stuList, new Comparator<StudentV1>() {
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {
                if(t1.getId().compareTo(t2.getId()) > 0){
                    return 1;
                }
                return -1;
            }
        });
        
                
                
    }
    public static void sortV2(){
        ArrayList<StudentV2> stuList = new ArrayList<>();
        stuList.add(new StudentV2("SE00001", "Lê", "An", 8.2));
        stuList.add(new StudentV2("SE00002", "Nguyễn", "Bình", 7));
        stuList.add(new StudentV2("SE00003", "Lý", "Dũng", 9));
        stuList.add(new StudentV2("SE00004", "Trần", "Cường", 5));
        stuList.add(new StudentV2("SE00005", "Võ", "Em", 9.9));
        //studentV2 là sinh viên đã có sẵn tính đô kỵ
        //nên khi sắp xep thì minh k càn phải comparator
        Collections.sort(stuList);
    }
}
