import java.util.*;
public class File17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arry : ");
        int size = sc.nextInt();
        Integer myarray[] = new Integer[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            myarray[i] = sc.nextInt();
        }
        System.out.print("Enter the value : ");
        int elem = sc.nextInt();
        for(int i=0;i<size;i++){
            int element = myarray[i];
            if(element==elem){
                size--;
            }
        }
        System.out.println(size-1);
        sc.close();
    }
    
}
