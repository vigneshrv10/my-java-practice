import java.util.*;
public class File4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            n/=10;
            int factorial = 1;
            for(int i=1;i<=digit;i++){
                factorial*=i;
            }
            sum += factorial;
        }
        System.out.println((sum==m)?(m+" is strong number"):(m+" is not strong number"));
        System.out.println(m);
        System.out.println(sum);
        sc.close();
    }
    
}
