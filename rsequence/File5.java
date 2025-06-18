import java.util.*;
public class File5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the steps : ");
        int n = sc.nextInt();
        int fv = 0;
        int sv = 1;
        System.out.print(fv+" "+sv+" ");
        for (int i=1;i<n;i++){
            int n1 = fv+sv;
            System.out.print(n1+" ");
            fv=sv;
            sv=n1;
        }
        sc.close();
        
    }
}
