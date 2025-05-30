/*
Car là khuôn chuyên đúc mấy chiếc xe
 */
package data;
public class Cars implements Comparable<Cars>{
    private String carID;
    private Brand brand;
    private String color;
    private String frameID;
    private String engineID;

    public Cars() {
    }

    public Cars(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }
    
    //get và set
    public void setCarID(String carID) {
        this.carID = carID;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }
    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }
    public String getCarID() {
        return carID;
    }
    public Brand getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public String getFrameID() {
        return frameID;
    }
    public String getEngineID() {
        return engineID;
    }
  
    //toString
    @Override
    public String toString() {
        String str = String.format("%s, %s, %s, %s, %s",
                carID, brand.getBrandID(), color, frameID, engineID);
        return str;
    }
    
     public String screenString() {
        String str = String.format("%s\n%s, %s, %s, %s",
                brand, carID, color, frameID, engineID);
        return str;
    }

    @Override
    public int compareTo(Cars that) {
        //so về tên của dòng xe
        String brandNameThis = this.brand.getBrandName();
        String brandNameThat = that.brand.getBrandName();
        if(brandNameThis.compareTo(brandNameThat) > 0){
            return 1;
        }else if(brandNameThis.compareTo(brandNameThat) == 0){
            if(this.getCarID().compareTo(that.getCarID()) > 1){
                return 1;
            }
        }
        return - 1;
    } 
}
