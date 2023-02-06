class DispalayMethodOverLoading{
    void display(char c){
        System.out.println(c);
    }
    void display(char c,int num) {
        System.out.println(c+" "+num);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
      DispalayMethodOverLoading obj =new DispalayMethodOverLoading();
      obj.display('a');
      obj.display('a',10);  

    }
    
}
