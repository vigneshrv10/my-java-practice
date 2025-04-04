import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int larger = (a>b)?a:b;
        System.out.println(larger+" is bigger");
        String type = (a%2==0)?"A is Even":"A is Odd";
        System.out.println(type);
        int marks = sc.nextInt();
        String result = (marks>=33)?"Pass":"Fail";
        System.out.println(result);
        sc.close();
    }
    
}
