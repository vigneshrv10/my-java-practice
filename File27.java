import java.util.*;
public class File27 {
    public static boolean areIsomorphic(String s1, String s2) {
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == c1 && s2.charAt(j) != c2) {
                    return false;
                }
                if (s2.charAt(j) == c2 && s1.charAt(j) != c1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        if (areIsomorphic(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}