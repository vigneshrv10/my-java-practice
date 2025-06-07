import java.util.*;
public class Strings {
    public static boolean ispalindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void printLetters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static float shortestpath(String str){
        int x=0,y=0;
        for (int i=0;i<str.length();i++){
            char direction = str.charAt(i);
            if (direction=='W'){
                x--;
            }
            else if(direction=='E'){
                x++;
            }
            else if(direction=='N'){
                y++;
            }
            else if(direction=='S'){
                y--;
            }
        }
        int x2 = x*x, y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static String substr(String str, int si, int ei){
        String substr = "";
        for (int i=si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static String upper(String s){
        StringBuilder sb = new StringBuilder("");
        char ch1 = Character.toUpperCase(s.charAt(0));
        sb.append(ch1);
        for (int i=1;i<s.length();i++){
            if (s.charAt(i-1)==' ' && i<s.length()-1){
                char ch = Character.toUpperCase(s.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compressor(String s){
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<s.length();i++){ // TC : O(n) bcoz we do i++ in while loop too
            Integer count = 1; // we have to convert it into string if needed
            char ch = s.charAt(i);
            while (i<s.length()-1  && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            if (count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static int count_vowels(String s){
        int count = 0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean anagram1(String s, String t){
        int l1 = s.length();
        int l2 = t.length();
        char alpha[] = new char[26];
        if (l1!=l2){
            return false;
        }
        else{
            for (int i=0;i<l1;i++){
                int index1 = s.charAt(i) - 'a';
                alpha[index1]++;
            }
            for(int j=0;j<l1;j++){
                int index2 = t.charAt(j) - 'a';
                alpha[index2]--;
            }
            for (int k=0;k<26;k++){
                if (alpha[k]!=0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        // strings introduction
        // char ch[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        // // strings are immutable
        

        // input output in strings
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // stores only 1 world in line
        System.out.println(name);
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println(name2);

        // String Length
        System.out.println("Vignesh Ravikrindhi".length());

        // String concatenation
        String firstname = "Vignesh";
        String lastname = "Ravikrindhi";
        String fullname = firstname+" "+lastname;
        System.out.println(fullname+" is my full name");


        // String charAt method
        printLetters(fullname);

        // check if a string is palindrome or not
        System.out.println(ispalindrome("racecar"));
        System.out.println(ispalindrome("Hi"));

        // Question - Shortest Path
        String direction = sc.nextLine();
        System.out.println(shortestpath(direction));

        // String Functions - Compare
        String s1 = "Vignesh";
        String s2 = "Vignesh";
        String s3 = new String("Vignesh"); // new string created in heap memory
        System.out.println((s1==s2)?"equal":"not equal");
        System.out.println((s1==s3)?"equal":"not equal");// caused due to interning concept;
        System.out.println(s1.equals(s3)); // equals checks the value in 2 variables - no reference

        // String Functions - Substring
        // start index, end index passed and substring is formed by not including end index
        System.out.println(substr("Hello World", 0, 4)); // our method
        System.out.println("Hello World".substring(0,4));

        // Print Largest String
        System.out.println("Apple".compareTo("Bpple"));
        String fruits[] = {"apple","banana","mango"};
        String larger = fruits[0];
        for (int i=1;i<fruits.length;i++){
            if (larger.compareTo(fruits[i])<0){
                larger = fruits[i];
            }
        }
        System.out.println(larger);


        // String Builder
        // it is a datastructure similar to string
        StringBuilder sb = new StringBuilder("");
        // int a = 10;
        // a.toString(); // not possible because int cant be converted to string
        Integer a = 10;
        a.toString();
        System.out.println(a);
        for (char ch='a';ch<='z';ch++){ // TC : O(26*n^2)
            sb.append(ch+" ");
        }
        System.out.println(sb);
        System.out.println(sb.length());


        // convert letters to upper case
        System.out.print("Enter a string : ");
        String sentence = sc.nextLine();
        System.out.println(upper(sentence));



        // String Compression
        System.out.print("Enter a repeating chars string : ");
        String compress = sc.nextLine();
        System.out.println(compressor(compress));


        // anagram approaches
        System.out.print("Enter a string s : ");
        String s = sc.nextLine();
        System.out.print("Enter a string t : ");
        String t = sc.nextLine();
        System.out.println((anagram1(s, t)?"Yes they are anagrams":"Not anagrams"));


        // java methods to replace characters
        // String newstring = oldstring.replace(old char, new char);
        String str3 = "banana";
        String newstr = str3.replace('a','o');
        System.out.println(str3);
        System.out.println(newstr);
        // replace(charseq target, charseq replacement)
        String newstr2 = str3.replace("an","xyz");
        System.out.println(newstr2);
        // replaceAll(String regex, String replacement)
        String str4 = "a1b2c3";
        String newstr3 = str4.replaceAll("\\d","#");  // \\ d means any digit
        System.out.println(newstr3);
        // replaceFirst(String regex, String replacement)
        String newstr4 = str3.replaceFirst("an", "xyz");
        System.out.println(newstr4);


        sc.close();

    }
}