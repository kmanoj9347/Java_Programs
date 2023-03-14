//method OverRiding 
class Parent {
    void print(){//Method of parent class
        System.out.println("parent class");
    }
}
class subclass_1 extends Parent {
    void print(){
        System.out.println("sub class_1");
    }
}
class subclass_2 extends Parent {
    void print(){
        System.out.println("sub class_2");
    }
}
public class OverRiding_01 {
 public static void main(String[] args) {
    Parent a;
     a =new subclass_1();
     a.print();
     a =new subclass_2();
     a.print();
 }   
}
