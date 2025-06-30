// oops is the programming approach 
/* type of class variables : local, static, instance
 * local - defined inside methods constructor and blocks.
 * instance - outside method and inside class with help of object can be accessed.
 * object : the methods and attributes which present inside can be accessed by objects
 * there are 3 ways to initialise a object : reference, constructor, method
 * 
 * 
 */
public class File24 {
    public static void main(String[] args) {
        Thursday th = new Thursday();
        th.display();
        Thursday.InnerClass thi = th.new InnerClass();
        thi.innermethod();


    }
}
class Thursday{
        int data;
        String s;
        Thursday(){
            System.out.println("Constructor called!");
        }
        public void display(){
            System.out.println("qwertyu");
        }
        class InnerClass{
            public void innermethod(){
                System.out.println("ertyui");
            }
        }
    }