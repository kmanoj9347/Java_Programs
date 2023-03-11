import java.util.*;
//base or super class.
 class Employee{
    int salary =60000;
}
//Inherited or sub class.
class Engineer extends Employee{
    int benefits =10000;
}
// test class.
class Test {
    public static void main(String[] args) {
        Engineer e1 =new Engineer();
        System.out.println("Salary : "+e1.salary+"\nBenefits : "+e1.benefits);
    }
}