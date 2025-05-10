import java.util.*;
public class PrimesInRange {
    public static void primes(int n){
        for (int i=1;i<=n;i++){
            int factors = 0;
            if (i==1){
                System.out.println(i+" is not prime");
                continue;
            }
            else{
                for (int j=2;j<=i-1;j++){
                    if (i%j==0){
                        factors+=1;
                        break;
                    }
                }
            }
            if (factors==0){
                System.out.println(i+" is prime");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        primes(a);
        sc.close();
    }
    
}