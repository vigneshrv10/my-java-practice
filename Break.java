import java.util.*;
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=5;i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("loop break");
        do{
            System.out.print("enter number : ");
            int input = sc.nextInt();
            if (input%10==0){
                System.out.println("multiple of 10");
                break;
            }
            System.out.println("not multiple of 10");
        }while(true);
        sc.close();
    }
    
}
