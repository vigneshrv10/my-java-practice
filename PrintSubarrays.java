public class PrintSubarrays {
    public static void printsub(int n[]){
        int times = 0;
        for (int i=0;i<=n.length-1;i++){
            for (int j=i+1;j<n.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                }
                System.out.println();
                times++;
            }
            System.out.println();
        }
        System.out.println("Times : "+times);
    }
    public static void main(String[] args) {
        int n[] = {1,69,75,55,44,66};
        printsub(n);
    }
    
}
