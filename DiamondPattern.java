import java.util.*;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        for (int i=1;i<=2*a;i++){
            String space = " ";
            String star = "*";
            if (i<=a){
                System.out.println(space.repeat(a-i)+star.repeat(2*i-1));
            }
            else{
                System.out.println(space.repeat(i-1-a)+star.repeat(4*a-2*i+1));
            }
        }
        sc.close();
    }
    
}
