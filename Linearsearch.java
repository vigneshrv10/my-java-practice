import java.util.*;
public class Linearsearch{
    public static int linerasearch(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lotterynumbers[] = {5,6,9,69,85,72,7};
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        System.out.println("The key is : "+linerasearch(lotterynumbers, key));
        sc.close();
    }
}


// search the unordered array until element is found else return -1. tc:- O(n)