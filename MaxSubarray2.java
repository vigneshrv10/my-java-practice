public class MaxSubarray2 { // kadane algorithm
    public static void kadanes(int n[]){ // only works for if atleast one positive value present in array
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean all_negative = false;
        for (int i=0;i<n.length;i++){
            if (n[i]>=0){
                all_negative = true;
                break;
            }
        }
        if (all_negative){
            for (int i=0;i<n.length;i++){
            cs += n[i];
            cs = (cs<0)?0:cs;
            ms = Math.max(cs, ms);
            }
            System.out.println("Maximum sum of subarray is : "+ms+" and a positive exists is "+all_negative);
        }
        else{
            int maxi = n[0];
            for (int i=0;i<n.length;i++){
                maxi = Math.max(maxi,n[i]);
            }
            System.out.println("Maximum sum of subarray is : "+maxi+" and a positive exists is "+all_negative);
        }
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,-1,-5,-3};
        kadanes(nums);
    }
}