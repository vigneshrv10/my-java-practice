import java.util.*;
public class File7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int myar[] = new int[n];
        for(int i=0;i<n;i++){
            myar[i] = sc.nextInt();
        }
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int elem = myar[i];
            if (elem>maxi){
                maxi = elem;
            }
            if (elem<mini){
                mini = elem;
            }
        }
        System.out.println("Maximum : "+maxi);
        System.out.println("Minimum : "+mini);
        sc.close();
    }
    
}
