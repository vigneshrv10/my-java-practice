import java.util.*;
public class HollowRecatangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a : ");
        int a = sc.nextInt();
        System.out.print("Enter a number for b : ");
        int b = sc.nextInt();
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                if(i==1 || j==1 || i==a || j==b){
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
