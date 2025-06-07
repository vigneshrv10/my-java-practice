import java.util.*;
public class BinarySystem {
    public static int deci_to_bin(int n){
        int result = 0;
        int mul = 1;
        while(n>=1){
            int remainder = n%2;
            result += remainder*mul;
            mul *= 10;
            n/=2;
        }
        return result;
    }
    public static int bin_to_dec(int n){
        int result = 0;
        int power = 0;
        while(n>0){
            int digit = n%10;
            result+= digit*Math.pow(2, power);
            n/=10;
            power++;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a deciaml number : ");
        int deci = sc.nextInt();
        System.out.println("Your binary format is : "+deci_to_bin(deci));
        System.out.print("Enter a binary number : ");
        int bin = sc.nextInt();
        System.out.println("Your decimal format is : "+bin_to_dec(bin));
        sc.close();
    }
    
}
