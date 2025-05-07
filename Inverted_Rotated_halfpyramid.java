import java.util.*;
public class Inverted_Rotated_halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++){
            for (int j=1;j<=a;j++){
                if (j==a || j>= a+1-i){
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
