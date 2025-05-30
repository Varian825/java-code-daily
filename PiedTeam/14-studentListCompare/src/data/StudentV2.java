
package data;
//StudentV2 là 1 cái khuôn dùng để đúc ra 1 sinh viên 
//có tính đố kỵ
//comparable là q interface(hội những người có tính đố kỵ)
public class StudentV2 implements Comparable<StudentV2> {
    private String id;
    private String fname;
    private String lname;
    private double score;
    
    //constructor
    public StudentV2(String id, String fname, String lname, double score) {
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

    @Override
    public int compareTo(StudentV2 that) {
        if(this.getId().compareTo(that.getId()) > 0){
            return 1;
        }
        return -1;
    }
}
