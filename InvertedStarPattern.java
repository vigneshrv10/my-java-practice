import java.util.*;
public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=(n+1-i);j++){
                System.err.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}