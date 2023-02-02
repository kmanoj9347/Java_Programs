abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    void draw () {

    }
}
class Circle extends Shape { 
    void draw(){
        System.out.println("drawing circel");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Circle s=new Circle();
        s.draw();
    }
}
