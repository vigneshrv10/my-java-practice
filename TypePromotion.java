public class TypePromotion {
    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = 'b';
        System.out.println(ch2-ch); // automatically ch and ch2 are promoted to int
        int a = 10;
        float b = 20.25f;
        long c = 20;
        double d= 30;
        System.out.println(a+b+c+d); // double is bigger of all a,b,c,d so all promoted to double
    }
    
}
