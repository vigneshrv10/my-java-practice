import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void print(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void print(Integer n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};
        Integer nums2[] = {5,4,1,3,2};
        // Arrays.sort(nums);
        // print(nums);
        // Arrays.sort(nums, 0, 3); // sorting upto toIndex is done not including toIndex
        // print(nums);
        Arrays.sort(nums);
        print(nums);
        Arrays.sort(nums2, Collections.reverseOrder());
        print(nums2);

    }

}