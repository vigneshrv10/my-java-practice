import java.util.*;
public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimalnumber = sc.nextInt();
        int mul = 1;
        int binarynumber = 0;
        do{
            int quotient = decimalnumber/2;
            int remainder = decimalnumber%2;
            binarynumber+= remainder*mul;
            mul *=10;
            decimalnumber = quotient;
        }while(decimalnumber!=0);
        System.out.println(binarynumber);
        sc.close();   
    }
    
}
