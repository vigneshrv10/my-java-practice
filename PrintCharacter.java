import java.util.*;
public class PrintCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        char ch = 'A';
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }
        sc.close();
    }
    
}
