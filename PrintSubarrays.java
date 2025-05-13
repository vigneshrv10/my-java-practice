public class PrintSubarrays {
    public static void printsub(int n[]){
        int times = 0;
        int maxsubarray_sum = Integer.MIN_VALUE;
        int minsubarray_sum = Integer.MAX_VALUE;
        for (int i=0;i<=n.length-1;i++){
            for (int j=i+1;j<n.length;j++){
                int subarraysum = 0;
                for (int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                    subarraysum+= n[k];
                }
                if (subarraysum>maxsubarray_sum){
                    maxsubarray_sum = subarraysum;
                }
                if (subarraysum<minsubarray_sum){
                    minsubarray_sum = subarraysum;
                }
                System.out.println();
                times++;
            }
            System.out.println();
        }
        System.out.println("Times : "+times);
        System.out.println("Maximum Sub Array Sum : "+maxsubarray_sum);
        System.out.println("Minimum Sub Array Sum : "+minsubarray_sum);
    }
    public static void main(String[] args) {
        int n[] = {1,69,-75,55,44,66};
        printsub(n);
    }
    
}
