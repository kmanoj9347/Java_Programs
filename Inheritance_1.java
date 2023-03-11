//java program of single inheritance
import java.util.*;
    class one {
        public  void print_hi(){//parent class
            System.out.println("Hai");
        }
    }
    class two extends one {//child class
        public void print_hello(){
            System.out.println("Hello");
        }
    }
    public class Inheritance_1 {
        public static void main(String[] args) {
            two g= new two();
            g.print_hi();
            g.print_hello();
        }
    }
