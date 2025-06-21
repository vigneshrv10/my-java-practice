import java.util.*;
public class File12 {
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
        int maxi = myarray[0];
        int freq[] = new int[maxi+1];
        for(int i=0;i<size;i++){
            int elem = myarray[i];
            freq[elem]++;
        }
        for(int i=0;i<maxi+1;i++){
            System.out.println(i+" "+freq[i]);
        }
        sc.close();
    }
    
}
