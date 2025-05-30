
package data;
//StudentV1 là 1 cái khuôn dùng để đúc ra 1 sinh viên bth
//bình thường là có những thuộc tính bth, k có tính đô kỵ
public class StudentV1 {
    private String id;
    private String fname;
    private String lname;
    private double score;
    
    //constructor
    public StudentV1(String id, String fname, String lname, double score) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.score = score;
    }
    
    //getter
    public String getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public double getScore() {
        return score;
    }
        
    public void showInFor(){
        String str = String.format("%-15s|%-20s|%-20s|%6.2f",
                                    id, fname, lname, score);
        System.out.println(str);
    }
}
