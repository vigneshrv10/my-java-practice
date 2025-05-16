import java.util.*;
public class BinarySearchPractice {
    public static void bs(int n[],int key){
        int start = 0, end = n.length-1,index = -1 ;
        while(start<=end){
            int mid = (start+end)/2;
            if (n[mid]==key){
                index = mid;
                break;
            }
            else if(mid < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("Index is : "+index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        int n[] = {0,1,2,3,4,5,66};
        bs(n, key);
        sc.close();

    }
    
}
