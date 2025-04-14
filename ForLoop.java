import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println(i);
        }
        for (int i=1;i<=a;i++){
            System.out.println("****");
        }
        int n = 10899;
        while (n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n/=10;
        }
        sc.close();
    }
    
}
