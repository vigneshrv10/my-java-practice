public class ReverseAnArray {
    
    public static void reversearray(int n[]){
        int first = 0, last = n.length - 1;
        while(first<last){
            int temp = n[last];
            n[last] = n[first];
            n[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,5,6,8,4,69};
        reversearray(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println();
    }
}

// tc : O(n), sc : O(1)
