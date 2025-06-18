import java.util.*;
public class File1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        for (int i=0;i<ch.length();i++){
            boolean result = false;
            char ch1 = ch.charAt(i);
            if (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                result = true;
            }
            else{
                result = false;
            }
            System.out.println((result)?(ch1+" is vowel"):(ch1+" is not vowel"));

        }
        sc.close();
    }
}
