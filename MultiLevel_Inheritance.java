class Animal{
    void eat(){
        System.out.println("Eating.....");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking.......");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping....");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        BabyDog bd =new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
