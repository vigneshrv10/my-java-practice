public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Assignment operator are =,+=,-=,*=,/=,%=.<<=,>>=,>>>=");
        int a = 10;
        a = a+10; // slow
        System.out.println(a);
        a+=10; //fast but both do same
        System.out.println(a);
    }
    
}
