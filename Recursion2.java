import java.util.*;
public class Recursion2 {
    public static void print_inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print_inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_inc(n);
        sc.close();
    }
}
