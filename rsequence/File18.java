import java.util.*;
public class File18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arry : ");
        int size = sc.nextInt();
        Integer myarray[] = new Integer[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            myarray[i] = sc.nextInt();
        }
        int result = 1;
        for(int i=0;i<size;i++){
            int element = myarray[i];
            if(element>0){
                result *= element;
            }
        }
        System.out.println("The max product is : "+result);
        sc.close();
    }
}
