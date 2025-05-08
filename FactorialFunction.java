import java.util.*;
public class FactorialFunction {
    public static int factorial(int a){
        int f = 1;
        for (int i=1;i<=a;i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int factorial = factorial(a);
        System.out.println("Factorial for ur num : "+factorial);
        sc.close();
    }
    
}
