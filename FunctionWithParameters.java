import java.util.*;
public class FunctionWithParameters {
    public static void print(){
        System.out.println("Hi vignesh");
        System.out.println("How are   you?");
    }
    public static int calculatesum(int a,int b){ // 2 integer parameters passed
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // 2 integer arguments passed
        System.out.println("Sum of a,b is : "+sum);
        print();
        sc.close();
        
    }
    
}
