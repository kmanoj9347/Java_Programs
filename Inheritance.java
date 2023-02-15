class Vehicle {
    String colour;
    int speed;
    int size;
    public int getSize(){
        return size;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSize(int i){
        size =i;
    }
    public void setSpeed(int i){
        speed =i;
    }
}
//sub class which extends form vehicle.
class Car extends Vehicle {
    int cc;
    int gears;
    void attributescar(){
    
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car cr =new Car();
        cr.colour ="Red";
        cr.setSpeed(200);
        cr.setSize(22);
        cr.cc=1000;
        cr.gears=5;
        System.out.println("Colour of car      : "+cr.colour);
        System.out.println("Speed of car       : "+cr.speed);
        System.out.println("Speed of car       : "+cr.getSpeed());
        System.out.println("Size of car        : "+cr.getSize());
        System.out.println("cc of car          : "+cr.cc);
        System.out.println("No of gears of car : "+cr.gears);
    }
}
