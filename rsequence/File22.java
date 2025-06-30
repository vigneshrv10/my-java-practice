import java.util.*;
public class File22 {
    public static int sum_of_n(int n){
        if(n==1){
            return 1;
        }
        return n+sum_of_n(n-1);
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of n number is : "+sum_of_n(n));
        System.out.println("Factorial of n : "+factorial(n));
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        sc.close();
    }
    
}
