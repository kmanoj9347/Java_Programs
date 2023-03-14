//method overriding
class Employee {
    public static int base =10000;//Base class
    int salary(){
        return base;
    }
}
class Manager extends Employee {
    //this method overrides salary() of parent 
    int salary(){
        return base +20000;
    }
}
class Cleark extends Employee {
    //this method override salary() of parent
    int salary(){
        return base +10000;
    }
}
class OverRiding_02{
    //this method can be used to print the salary of 
    // any type of employee using base class reference
    static void printSalary(Employee e){
        System.out.println(e.salary());
    }
    public static void main(String[] args) {
        Employee obj1 =new Manager();
        System.out.print("Manager's salary : ");
        printSalary(obj1);
        Employee obj2 =new Cleark();
        System.out.print("Cleark's saalry : ");
        printSalary(obj2);
    }
}