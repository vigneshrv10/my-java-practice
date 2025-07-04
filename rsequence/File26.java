public class File26 {
    public static void main(String[] args) {
        example_method a = new example_method();
        System.out.println(a.add(5,3));
        sub1 s = new sub1();
        s.display();
        s.show();
    }

}
class example_method{
    public int add(int a,int b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
}
abstract class example{
    public abstract void display();
    public void show(){
        System.out.println("from abstract class");
    }
}
class sub1 extends example{
    public void display(){
        System.out.println("from abstract method");
    }
}