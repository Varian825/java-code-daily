package superKeyword;

public class SinhVienCoKhi extends SinhVien{
    protected String skill;

    public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    @Override
     void tinhDiem(){

    }
}
