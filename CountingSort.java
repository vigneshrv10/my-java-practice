public class CountingSort {
    public static void cs(int n[]){
        int big = Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            big = Math.max(big , n[i]);
        }
        int count[] = new int[big+1];
        for (int i=0;i<n.length;i++){
            int element = n[i];
            count[element]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                n[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Counting sort implemented");
    }
    public static void print(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1,4,1,3,2,4,3,7};
        cs(nums);
        print(nums);
    }
    
}
