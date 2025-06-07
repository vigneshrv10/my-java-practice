// import java.util.*;
public class BitManipulation {
    public static int getbit(int n,int i){
        int bitmask = 1<<i;
        return ((n&bitmask)==0)?0:1;
    }
    public static int setbit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearbit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updatebit(int n,int i, int newbit){
        return (newbit==0)?(n&(~(1<<i))):(n|(1<<i));
    }
    public static int clearbitsinrange(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        return n&(a|b);
    }
    public static boolean powerof2(int n){
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // System.out.print("Enter the index to get bit at : ");
        // int i = sc.nextInt();
        // System.out.println(getbit(n, i));
        // System.out.print("Enter the index to set bit at : ");
        // i = sc.nextInt();
        // System.out.println(setbit(n, i));
        // System.out.print("Enter the index to clear bit at : ");
        // i = sc.nextInt();
        // System.out.println(clearbit(n, i));
        // System.out.print("Enter the index to update bit at : ");
        // i = sc.nextInt();
        // System.out.print("Enter the new bit to to get updated at "+i+"th index : ");
        // int newbit = sc.nextInt();
        // System.out.println(updatebit(n, i, newbit));
        // System.out.print("Enter the index i for clear bits in range : ");
        // i = sc.nextInt();
        // System.out.print("Enter the index j for clear bits in range : ");
        // int j = sc.nextInt();
        // System.out.println(clearbitsinrange(n, i, j));
        // System.out.print("Enter a number to find if its power of 2 : ");
        // int m = sc.nextInt();
        // System.out.println(powerof2(m));
        System.out.println(1^1); // xor gate. x^x = 0
        System.out.println(~(5)+1);
        int x = 3, y = 4;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x+","+y);
        // sc.close();
    }
}