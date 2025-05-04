import java.util.*;
public class While {
    public static void main(String[] args) {
        int counter = 0;
        while (counter<10){
            System.out.println("Hello world");
            counter++;
        }
        System.out.println("Hello world is printed "+counter+" items"); // 10 because when counter is 10 the loop is stopped
        int counter2 = 1;
        while (counter2<=100){
            System.out.print(counter2+" ");
            counter2++;
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter3 = 1;
        int total = 0;
        while (counter3<=n){
            total+=counter3;
            counter3++;
        }
        System.out.println("Sum of "+n+" natural numbers is "+total);
        sc.close();
    }
    
}
