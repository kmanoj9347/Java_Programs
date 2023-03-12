//Multilevel inheritance
import java.util.*;
import java.io.*;
import java.lang.*;
class one{
    public void print_hai(){
        System.out.println("Hai");
    }
}
class two extends one {
    public void print_hello(){
        System.out.println("Hello");
    }
}
class three extends two {
    public void print_bye() {
        System.out.println("Bye");
    }
}
public class Inheritance_02 {
    public static void main(String[] args) {
        three obj =new three();
        obj.print_hai();
        obj.print_hello();
        obj.print_bye();
    }
}
