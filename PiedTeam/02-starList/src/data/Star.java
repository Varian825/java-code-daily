package data;
//bộ khuôn để đúc ra các ca sĩ
//ca sĩ nào cũng bước ra từ cái khuôn này
//class (khuôn) dùng để tạo ra các object(đối tượng)

public class Star {

    //properties-props-field-attribute: thuộc tính
    private String name;
    public int yob;
    public static String gender;
    public String hotSong;

    //static: ám chỉ props hoặc method thuộc về class
    //các object phải xài chung, nên lúc đầu tạo ra Ngọc trinh
    //thì nó là NŨ, nhưng khi tạo ra anh Điệp thì nó bi đổi là Nam
    //và vì xài chùng nên trinh bị đổi thanh "Nam".
    //method: phương thức
    //cái phễu: hàm có chức năng rót giá trị để đúc object
    //cái phễu: constructor: phải cùng tên với class
    //cái phễu: không đuọc quy định đầu ra
    //cái phễu: phải là public,  nếu k thì k ai xài đc
    public Star(String name, int yob, String gender, String hotSong) {
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.hotSong = hotSong;
        //this tự nói về chính mình, ám chỉ class chứa nó
    }

    //method: showInFor
    public void showInFor() {
        System.out.println("Tui tên là " + name
                + ", Tui sinh năm " + yob
                + ", Giới tính là " + gender
                + ", hot song là " + hotSong);
    }

    //tạo 1 accessor properties: getName
    //getter và setter
    public String getName() {
        return this.name;
    }

    public void setName(String newName, int password) {
        name = password == 571994 ? newName : name;
    }
}
