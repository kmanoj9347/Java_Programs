// Method overloading 
//by using different types of arguments

 class Helper {
    //Method 1
    //Multiplication of 2 numbers .
    static int Multiply(int a,int b){
        return a*b;
    }
    //Method 2
    // Multiplication of 3 numbers
    static int Multiply(int a ,int b,int c){
        return a*b*c;
    }
}
class OverLoading_01 {
    public static void main(String[] args) {
            System.out.println(Helper.Multiply(2, 4));
            System.out.println(Helper.Multiply(2, 7,3));
    }
}

