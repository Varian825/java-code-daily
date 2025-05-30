package runtime;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //tạo mảng lưu các sinh viên sẽ quản lý
        //ArrayList là 1 mảng xịn , có khả năng co giản
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner sc = new Scanner(System.in);//bộ nhập
        do {
            showMenu();
            System.out.println("Vui lòng nhập lựa chọn nhé: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    System.out.println("Thêm mới sinh viên");
                    Student newStudent = new Student();
                    newStudent.inputInfor();
                    studentList.add(newStudent);//theem sinh vieen vao danh sach
                    break;
                }
                case 2: {
                    System.out.println("In ra danh sách sinh viên");
                    if(studentList.isEmpty()){
                        System.out.println("Danh sách sinh viên rỗng");
                        break;
                    }
                    for(Student student : studentList){
                        student.showInfor();//kêu mỗi sinh viên in 1 cái
                    }
                    break;
                }
                case 3: {
                    System.out.println("Tìm siênh gà và giỏi nhất");
                    //giả định
                    float maxPoint = studentList.get(0).getGpa();
                    float minPoint = studentList.get(0).getGpa();
                    for(Student student : studentList){
                        if(student.getGpa() > maxPoint) maxPoint = student.getGpa();
                        if(student.getGpa() < minPoint) minPoint = student.getGpa();
                    }
                    //chạy từ đầu đến cuối, ai có điểm giống maxPoint thì in ra
                    System.out.println("Những thằng có giỏi nhất nè: ");
                    for (Student student : studentList) {
                        if(student.getGpa() == maxPoint) student.showInfor();
                    }
                    System.out.println("Những thằng có gà nhất nè: ");
                    for (Student student : studentList) {
                        if(student.getGpa() == minPoint) student.showInfor();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Tìm kiếm sinh viên dựa trên mã");
                    System.out.println("Nhập mã id cần tìm: ");
                    String keyId = sc.nextLine();
                    boolean isFind = false;
                    for (Student student : studentList) {
                        if(student.getId().equals(keyId)){
                            student.showInfor();
                            isFind = true;
                        }
                    }
                    if(!isFind){
                        System.out.println("Không tìm thấy sinh viên nào");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Sắp xếp sinh viên theo tên");
                    //sắp xếp
                    //vì mảng của mình là ArayList nên nó co 1 bôj công cụ thuộc
                    //sở hữu cua Collections
                    //sort + comparator(anh trọng tài)
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student t1, Student t2) {
                            if(t1.getName().compareTo(t2.getName()) > 0){
                                return 1;//swap
                            }else{
                                return -1;//ko swap
                            }
                        }
                    });
                    //show
                    for (Student student : studentList) {
                        student.showInfor();
                    }
                    break;
                }
                case 6: {
                    System.out.println("In ra sing viên có học bổng");
                    //sắp xếp
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student t1, Student t2) {
                            if(t1.getGpa() > t2.getGpa()) return 1;//swap nè
                            else return -1;
                        }
                    });
                    Collections.reverse(studentList);
                    //show
                    for (Student student : studentList) {
                        if(student.isScholarship()) student.showInfor();
                    }
                    break;
                }
                case 7: {
                    System.out.println("Xin chào tạm biệt");
                    break;
                }
                default: {
                    System.out.println("Vui lòng nhập 1 - 7 nhé!!!");
                    break;
                }
            }
        } while (choose != 7);
    }

    public static void showMenu() {
        System.out.println("Student management Application");
        System.out.println("1. Nhập vào 1 sinh viên");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3. Hiển thị max min theo điểm trung bình");
        System.out.println("4. Tìm kiếm theo mã sinh viên");
        System.out.println("5. Sắp xếp sinh viên theo tên ásci và hiển thị");
        System.out.println("6. In ra sinh viên có học bổng và hiển thị desc");
        System.out.println("7. Thoát");
    }

}

/*
    ---Quản ly danh sách sinh viên---
Menu gom các chức năng cơ bản
    1. Nhập vào 1 sinh viên
    2. Hiển thị thông tin sinh viên
    3. Hiển thị max min theo điểm trung bình
    4. Tìm kiếm theo mã sinh viên
    5. Sắp xếp sinh viên theo tên ásc và hiển thị
    6. In ra sinh viên có học bổng và hiển thị desc
    7. Thoát
Trong chuong trình tôi muốn có :
Person class
    bao gồm: name, gender, yob
    co phễu co  đối số, và k có đổi số
    có getter và k có setter
    method showInfor
    method nhập thôgn tin ngươi dùng
Student class
    sử dụng kế thừa để có đc name, gender, yob của person
    riêng Student thì muốn có thêm id, gpa, email
    phễu có đối số, và k có đối số
    getter và k có setter
    showInfor
 */
