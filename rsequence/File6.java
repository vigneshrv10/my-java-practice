import java.util.*;
public class File6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        boolean prime = true;
        for (int i=2;i<n;i++){
            if(n==2){
                break;
            }
            if(n%i==0){
                prime = false;
                break;
            }
        }
        System.out.println((prime)?(n+" is prime"):(n+" is not prime"));
        sc.close();
    }
    
}
