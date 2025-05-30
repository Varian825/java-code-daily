/*
StudyEnthusiasts:những người rất đam mê học tập
Nếu mà bác thợ săn cuae em đến học mà k thèm nhìn "phò mã", chỉ tập 
    trung cho việc học thôi -> mê học hơn cae ăn uống, thì bác là 1 StudyEnthusiasts
Nếu ngựa và khỉ đến học dù có bác thợ săn ở đso, k màn đến tính mang mà vẫn học 
    -> mê học hơn cả mangg sống, hội ham học thì rõ ràng là StudyEnthusiasts
Nếu em là 1 người bth, nhưng tham gia vào StudyEnthusiasts thi lập tức em
sẽ sở hữu 1 method "Học skip all"
StudyEnthusiasts là 1 hội nhóm gồm những người đam mê học tập hơn tất cả 
k cần quan tâm là loài gì, con gì, học thế nào, miễn là bạn muốn học"học mà k cần 
quan tâm gì cả" thì đến đây, vào đây.
Dù ngựa và khỉ, bác thợ săn khác nhâu nhiều thứ về mặt sinh học, nhưng chỉ cần 
họ muốn trở thanh người "học mà k quan tâm gi cả" thi fcos thể trơ thành hội viên
của clb StudyEnthusiasts này

Interface: là 1 class chỉ có method mà thôi, k quan tâm đến props ở đây chỉ quan 
tâm học mà thôi, còn học như nào thì tùy bạn.
 */
package data;

public interface StudyEnthusiasts {
    //ai có thể trở thành 1 StudyEngthusiasts:
    // chỉ cần muốn "học k quan tâm gì cả" thì có thể
    //họ k quan tâm em học lớp nào ở đâu trường nào -> k quan tâm thuộc tính
    //Nếu mà anh cố tình tạo prop trong này thì sẽ ra sao?
    //int FAN = 8;
    //public static final int FAN = 8;
    //dù là dùng cách khai báo nào thì FAN vẫn là hằng số xài chung của các 
    //instance 
    //tất cả các prop trong interface đêù sẽ là hằng số => final 
    //                                                  => phải có giá trị sẵn
    
    //tóm lai: trong interface thì k có props nào, nếu có thì prop đo xài chung
    // và có sẵn giá trị lúc khởi tạo => k cần phễu -> nó sẽ xai phễu mặc định (rỗng)
    
    //StudyEnthusiast: là clb những người ham học, ai vào đay đều sẽ học chăm chỉ 
    //hơn so với bth, nhưng học như nào thì tùy mõi người nữa
    
    //tất cả các method trong interface đều đưoc hiểu là abstract method
    
    public double studyHard();
    
    public void showProfile();
    
    //thực tế thì 1 interface k nên sở hữu 2 method
}
