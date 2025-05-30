
package data;
/*
Herbivore: động vật ăn cỏ
*/
public abstract class Herbivore {
    //props
    protected String name;
    protected int yob;
    protected double weight;
    
    //constructor
    public Herbivore(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }
    
    //getter
    public String getName() {
        return name;
    }
    public int getYob() {
        return yob;
    }
    public double getWeight() {
        return weight;
    }

    //method: Override toString
    //toString: laf hamf return ra String(1 chuõi tạo từ cac props của project
    //ai gọi toString thì có thể kết String đó để sử dụng(in màn hình)
    @Override
    public String toString() {
        String msg;
        msg = String.format("%10s|%-20s|%4d|%6.2f",
                "Herbivore", name, yob, weight);
        return msg;
    }
    //mỗi một Herbivore thì nó sẽ có mức độ tiếp thu khác nhau 
    //vd: ngựa thi vừa học vừa hú hí :))
    //  thi vừa học vừa nhảy
    //  khi thì học kiểu bắt chước(mimic)
    //nên anh nói rằng study là 1 hanh dong sẽ k có công thức chung
    //cho tất cả động vật ăn cỏ -> study ẽ là abstract method với Herbivore
    
    public abstract double Study();
    //cì cách học khác nhau nên dẫn đến việc "mỗi con vật sẽ hiển thị kết quả
    //"học khác nhau"
    public abstract void showLearningOutcomes();
}
