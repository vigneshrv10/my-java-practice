import java.util.*;
public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for (int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int binomialcoeffici(int n,int r){
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int n_r_factorial = factorial(n-r);
        int result = (n_factorial)/(r_factorial*n_r_factorial);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int result = binomialcoeffici(n, r);
        System.out.println("Binomial Coefficient of "+n+" and "+r+" is : "+result);
        sc.close();
    }
    
}
