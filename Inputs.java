// import java.util.*;
// public class Inputs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(a);
//         String b = sc.nextLine();
//         System.out.println(b);
//         sc.nextLine();
//         String line = sc.nextLine();
//         System.out.println(line);
//         float price = sc.nextFloat();
//         System.out.println(price);
//     }
// }
// // 
import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.println(a);
        
        String b = sc.next();
        System.out.println(b);

        sc.nextLine();  // Consume the leftover newline

        String line = sc.nextLine();
        System.out.println(line);

        float price = sc.nextFloat();
        System.out.println(price);

        sc.close(); // Always close the scanner to prevent memory leaks
    }
}
