import java.util.*;
public class prime_indexed_sum {
    public static boolean is_prime(int n){
        boolean p = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                p = false;
                break;
            }
        }
        if(n==1 || n==0){
            p = true;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int sum = 0;
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
            if(is_prime(i+1)){
                sum += a[i];
            }
        }
        System.out.println("Sum is : "+sum);
        sc.close();
        
    }
}