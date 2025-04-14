public class Reverse {
    public static void main(String[] args) {
        int n = 10052005;
        while (n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;

        }
        System.out.println();
        int m = 10052005;
        int rev = 0;
        while (m>0){
            int lastdigit = m%10;
            rev = (rev*10)+lastdigit;
            m = m/10;
        }
        System.out.println(rev);
    }
    
}
