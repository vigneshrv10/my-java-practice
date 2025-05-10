// Approach 1
// import java.util.*;
// public class Prime2 {
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         if (n==1){
//             return false; // end of function if n=1 and directly returns false without going to following lines
//         }
//         for (int i=2;i<=n-1;i++){
//             if (n%i==0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int a = sc.nextInt();
//         String statment = (isPrime(a))?(a+" is prime"):(a+" is not prime");
//         System.out.println(statment);
//         sc.close();
//     }
// }
// Approach 2 - optimized approach
import java.util.*;
public class Prime2{
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        String statment = (isPrime(a))?(a+" is prime"):(a+" is not prime");
        System.out.println(statment);
        sc.close();
    }
}