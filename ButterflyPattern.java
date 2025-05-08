import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        for (int i=1;i<=2*a;i++){
            for (int j=1;j<=2*a;j++){
                if (i<=a && (j<=i || j>=2*a-i+1)){
                    System.out.print("* ");
                }
                else if(i>a && (j<=2*a+1-i || j>=i)){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
