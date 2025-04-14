import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==2){
            System.out.println("prime");
        }
        else{
            boolean prime = true;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
        sc.close();
    }
    
}
