
class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
//    void eat() {
//        System.out.println("dog is eating...");
//    }
}

class BabyDog1 extends Dog {
    void eat() {
        System.out.println("babydog is eating...");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("cat is eating...");
    }
}

public class Program {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new BabyDog1();
        a.eat();
        b.eat();
    }
}