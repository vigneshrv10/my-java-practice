import java.util.*;
public class File14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            String star = "* ";
            System.out.println(star.repeat(i));
        }
        sc.close();
    }
    
}
