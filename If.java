import java.util.*;
public class If{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=18){
            System.out.println("Vote, drive");
        }
        else{
            System.out.println("You are not adult");
        }
        sc.close();
    }
}