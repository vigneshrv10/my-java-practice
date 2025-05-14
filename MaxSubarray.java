// prefix sum approach
public class MaxSubarray {
    public static void maxsubarray(int n[]){
        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        int prefix_array[] = new int[n.length];
        prefix_array[0] = n[0];
        for (int i=1;i<n.length;i++){
            prefix_array[i] = prefix_array[i-1] + n[i];
        }
        for (int i=0;i<n.length;i++){
            int start = i;
            for (int j=i;j<n.length;j++){
                int end = j;
                current_sum = start==0? current_sum = prefix_array[end] : prefix_array[end] - prefix_array[start-1];
                if (current_sum>maximum_sum){
                    maximum_sum = current_sum;
                }
            }
        }
        System.out.println("Maximum sum is : "+maximum_sum);
    }
    public static void main(String[] args) {
        int n[] = {1,69,-75,55,44,66};
        maxsubarray(n);
    }
}
