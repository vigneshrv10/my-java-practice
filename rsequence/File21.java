import java.util.*;
public class File21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            boolean b = false;
            for(int j=i+1;j<s.length();j++){
                char ch2 = s.charAt(j); 
                if(ch==ch2){
                    System.out.println(ch);
                    b = true;
                    break;
                }
            }
            if(b){
                    break;
            }
        }
        sc.close();
    }
}