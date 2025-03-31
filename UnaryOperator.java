public class UnaryOperator {
    public static void main(String[] args) {
        System.out.println("++,-- are unary. a = a+1 can be written as a++ or ++a");
        System.out.println("Pre increment. 1- value change 2- use value");
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Post increment. 1- use value 2- value change");
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        System.out.println("Pre increment. 1- value change 2- use value");
        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);
        System.out.println("Post increment. 1- use value 2- value change");
        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
    
}
