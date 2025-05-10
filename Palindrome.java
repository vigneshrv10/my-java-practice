import java.util.*;
public class Palindrome {
    public static int reverse(int n){
        int result = 0;
        while (n>0){
            int digit = n%10;
            result = result*10+digit;
            n/=10;
        }
        return result;
    }
    public static boolean ispalindrome(int n, int reverse_n){
        if (n==reverse_n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int reverse_n = reverse(n);
        String statment = (ispalindrome(n, reverse_n))?(n+" is palindrome"):(n+" is not palindrome");
        System.out.println(statment);
        sc.close();
    }
    
}
