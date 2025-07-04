import java.util.*;
public class Recursion6 {
    public static int[] array_input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        return a;
        
    }
    public static void print_array_elements(int a[]){
        System.out.print("{ ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("}");
        System.out.println();
    }
    public static boolean sorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return sorted(a, i+1);
    }
    public static void main(String[] args) {
        int a[] = array_input();
        print_array_elements(a);
        System.out.println((sorted(a, 0))?("This array is sorted"):("This array is not sorted"));
    }
    
}
