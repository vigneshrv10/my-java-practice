import java.util.*;
public class Recursion5 {
    public static int fibonacci_series(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibonacci_series(n-1) + fibonacci_series(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci_series(i)+" ");
        }
    }
}
