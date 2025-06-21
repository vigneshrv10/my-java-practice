import java.util.*;
public class FIle15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            String space = " ";
            String star = "* ";
            if(i==1){
                System.out.println(space.repeat(n-i)+star);
            }
            else if(i<n){
                System.out.println(space.repeat(n-i)+star+space.repeat(2*(i-2))+star);
            }
            else{
                System.out.println(star.repeat(n));
            }
        }
        sc.close();
    }
}
