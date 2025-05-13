import java.util.*;
public class Binarysearch {
    public static int binarysearch(int n[],int key){
        int start = 0, end = n.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if (n[mid]==key){
                return mid;
            }
            if (n[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {0,55,69,73,85,96};
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        System.out.println("The index of your key is : "+binarysearch(array, key));
        sc.close();
    }   
}
