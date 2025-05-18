import java.util.*;
public class SelectionSort {
    public static void ss(int n[]) { // ascending sort
        for (int i=0;i<n.length;i++){
            int min_pos = i;
            for (int j=i+1;j<n.length;j++){
                if (n[min_pos]>n[j]){
                    min_pos = j;
                }
            }
            int temp = n[min_pos];
            n[min_pos] = n[i];
            n[i] = temp;
        }
        System.out.println("selection sort implemented asceding");
    }
    public static void ss_dec(int n[]) { // descending sort
        for (int i=0;i<n.length;i++){
            int min_pos = i;
            for (int j=i+1;j<n.length;j++){
                if (n[min_pos] < n[j]){
                    min_pos = j;
                }
            }
            int temp = n[min_pos];
            n[min_pos] = n[i];
            n[i] = temp;
        }
        System.out.println("Selection sort implemented descending");
    }
    public static void print(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of you array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the "+i+"th index element : ");
            nums[i] = sc.nextInt();
        }
        ss(nums);
        print(nums);
        ss_dec(nums);
        print(nums);
        sc.close();

    }
    
}
