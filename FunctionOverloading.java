// function or method overloading means multiple functions having same name but different parameters. 
// for example, a sum function can have 2 or 3 parameters
public class FunctionOverloading {
    // function overloading using parameters
    // public static int sum(int a,int b){ // 2 parameters only
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){ // 3 parameters only
    //     return a+b+c;
    // }
    // function overloading using data types
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        // System.out.println(sum(2,3));
        // System.out.println(sum(5,69, 73));
        System.out.println(sum(3,5));
        System.out.println(sum(3.14f,6.9f));
    }
    
}
