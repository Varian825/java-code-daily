
package data;
/*
vì mình muốn con Dog và Cat nằm cùng 1 mảng nên Pet là cái cớ để mình qui Dog 
và Cat về cùng một nhà ,vậy thì Pet phải chứa những điểm chung của Dog và Cat
*/

public abstract class Pet {
    protected String id;
    protected String owner;
    protected String color;
    protected double weight;
    
    //constructor

    public Pet(String id, String owner, String color, double weight) {
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.weight = weight;
    }
    
    //getter

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
     
    // setter

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
     
    
    //method : showinfor(); tạo chuỗi đẹp và in lun 
    public abstract void showInfor();
    
    
}
