import java.util.*;
public class Recusrion1 {
    public static void print_dec(int n){
        if(n==1){
            System.out.println(n);;
            return;
        }
        System.out.print(n+" ");
        print_dec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_dec(n);
        sc.close();
    }
    
}
