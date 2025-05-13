public class TotalPairs {
    public static void printpairs(int n[]){
        int tp = 0;
        for (int i=0;i<=n.length-1;i++){
            int current = n[i];
            for (int j=i+1;j<=n.length-1;j++){
                int current2 = n[j];
                if (j!=n.length-1){
                    System.out.print(" ("+current+" , "+current2+") ,");
                }
                else{
                    System.out.print(" ("+current+" , "+current2+")");
                }
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        int nums[] = {1,5,6,88,45,66};
        printpairs(nums);
    }
    
}
