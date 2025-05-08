import java.util.*;
public class SolidRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++){
            String space = "  ";
            String chari = "* ";
            System.out.println(space.repeat((a-i))+chari.repeat(a));
        }
        sc.close();
    }
    
}
