public class BasicSum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
        a = 20;
        System.out.println(sum); // sum not changed
        System.out.println(a+b);
    }
    
}
