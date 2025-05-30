
package runtime;

import data.Herbivore;
import data.Horse;
import data.Hunter;
import data.Monkey;
import java.util.ArrayList;

/*
    Mình có một nhiệm vụ là phổ cập kiến thức cho muôn loài
mà đánh trọng tâm vào vùng hoan dã, ngày đầu tiên anh đi dạy 
thì gặp đc các con vật rất là dễ thương ngựa, khỉ (Herbivore)
*/
public class Program {
    public static void main(String[] args) {
       //tạo vài con khỉ, vài con ngựa
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("Abu", 1994, 30);
        Horse h1 = new Horse("Rarity", 2015, 9, "None");
        Herbivore h2 = new Horse("Roach", 1976, 45, "Grey");
        //bỏ vào mảng để lưu
        //mảng cùi
        Herbivore StuList[] = {m1, m2, h1, h2};//tạo ra mang nguyên thủy có size là 4
        
        //mảng ArayList
        ArrayList<Herbivore> stuList = new ArrayList<>();
        stuList.add(m1);
        stuList.add(m2);
        stuList.add(h1);
        stuList.add(h2);
        //in
        for (Herbivore item : stuList) {
            item.showLearningOutcomes();
        }
        //bàn chuyện riêng 1 tý nha m
        //trong 1 ngày trời lanh vô cùng
        //tuyết đỗ trắng xóa, thì mọi người đang học trong cái 
        //lạnh co ro, thì có 1 ban thú nhỏ bé, chậm chạp đi vào
        //vì trời quá lạnh nên bạn mặc kính mít, thấy bạn chậm chạp
        //nên mình tin rằng bnaj hiền, bạn này chỉ ăn lá cây
        //nhưng k biết rỏ bạn thật tế là con gì
        
        //dùng anonymours để mô tả con vật chậm chạp này
        Herbivore xxx = new Herbivore("con chậm chạp", 2024, 4) {
            @Override
            //bạn chậm chạp k ai thèm chơi chung nen bạn học rất giỏi và rất tập chung
            //-> Giỏi
            public double Study() {
                return 80;
            }
            
            @Override
            public void showLearningOutcomes() {
                String str = String.format("%10s|%-20s|%4d|%6.2f|%6.2f",
                                           "XXX", name, yob, weight, Study());
                System.out.println(str);
            }
        };
        stuList.add(xxx);//xxx là con vật ăn cỏ nên vẫn nhét vào stuList
        //lớp học lại có thêm 1 bạn mới, lớp trở nen soi đọng
        //lập tức có 1 người dến học, đo là bác thợ săn
        //bác đến vì ham học, nên bác muốn tham gia vao lớp của mình
        //Vậy thi ta phải lưu trữ bác thợ săn
        Hunter hun1 = new Hunter("Thợ săn vượn", 1999, 0, "Nỏ");
        Hunter hun2 = new Hunter("Mắt diều hâu", 1999, 0, "Cung");
        
        hun1.showLearningOutcomes();
        hun2.showLearningOutcomes();
        //dù có những method giống bọn herbivore nhưng bác thợ săn k thể 
        //nhét vào mảng stuList do vì bác k có dây mơ rễ má gì cả
    }  
}
//mình k thể nào tìm ra điểm chung của người và đọng vật ăn cỏ
//ngoài việc bác thợ săn, khỉ, ngựa ham học, thích học thì k có điểm chung nào cả
//nhưng mình muốn quản lý, thì nghĩa là muốn gom chúng về chung 1 nhà, phải giống
//nhau về mặt sinh học, nếu như k thể chung với nhau về mặt sinh học, thì phải 
//chung ve dam me
