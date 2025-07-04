import java.util.*;
public class Recursion4{
    public static int sum_of_n(int n){
        if(n==1){
            return 1;
        }
        return n+sum_of_n(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(sum_of_n(n));
    }
}