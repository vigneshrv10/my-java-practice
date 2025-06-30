import java.util.*;
public class File23 {
    public static void reverse_of_on(int n){
        if(n<1){
            return;
        }
        int digit = n%10;
        n/=10;
        System.out.print(digit);
        reverse_of_on(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        reverse_of_on(n);
        sc.close();
    }
}
