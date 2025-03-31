import java.util.*;
public class TypeConversion {
    public static void main(String[] args) {
        float a = 25.12f;
        // int b = a; // will cause error bcoz float is bigger than int
        int b = (int)a; // type conversion and data will be lost or reduced
        float c = b; // int can be converted to float bcoz float is bigger than int
        System.out.println(c);
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}
