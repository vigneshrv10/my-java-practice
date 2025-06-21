import java.util.*;
public class File10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arry : ");
        int size = sc.nextInt();
        Integer myarray[] = new Integer[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            myarray[i] = sc.nextInt();
        }
        Arrays.sort(myarray,Collections.reverseOrder());
        System.out.println("Second max element : "+myarray[1]);
        sc.close();
    }
    
}
