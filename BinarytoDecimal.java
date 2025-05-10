import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int n = sc.nextInt();
        int result = 0;
        int power = 0;
        while(n>0){
            int digit = n%10;
            n/=10;
            result += digit*(Math.pow(2, power));
            power++;
        }
        System.out.println(result);
        sc.close();
    }
}