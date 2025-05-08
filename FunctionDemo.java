// public class FunctionDemo {
//     public static int print(){ // we specified int here so it should confirmly return an int value
//         System.out.println("Hi good morning or whatever it is");
//         System.out.println("Hello vignesh");
//          return 3 // 3 is returned
//     }
//     public static void main(String[] args) {
//         print();
//         print();
//         print();
//     }
    
// }

public class FunctionDemo {
    public static int print(){
        System.out.println("Hi good morning or whatever it is");
        System.out.println("Hello vignesh");
        return 3;
    }
    public static void main(String[] args) {
        print();
        print();
        print();
        System.out.println(print()); // 3 will also be printed because it is returned from print() method
    }
    
}
