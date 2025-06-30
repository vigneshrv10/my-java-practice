import java.util.*;
public class File19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean is_palindrome = true;
        int len = s.length();
        for(int i=0;i<=(len/2);i++){
            if(s.charAt(i)==s.charAt(len-1-i)){
                continue;
            }
            else{
                is_palindrome = false;
                break;
            }
        }
        System.out.println((is_palindrome)?("Palindrome"):("Not palindrome"));
        sc.close();
    }
}
