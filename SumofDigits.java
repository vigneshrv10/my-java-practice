import java.util.*;
public class SumofDigits {
    public static int sum(int n){
        int sum = 0;
        while (n>0){
            int digit = n%10;
            sum += digit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sumofdigits = sum(n);
        System.out.println(sumofdigits);
        sc.close();
        
    }
    
}
