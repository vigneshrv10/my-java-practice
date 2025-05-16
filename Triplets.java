public class Triplets {
    public static void triplets(int n[]){
        for (int i=0;i<n.length;i++){
            for (int j=0;j<n.length;j++){
                for (int k=0;k<n.length;k++){
                    if ((i !=j && j!= k && i!=k) && (n[i] + n[j] + n[k] == 0)){
                        System.out.println("[ "+n[i]+", "+n[j]+", "+n[k]+"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n[] = {-1,0,1,2,-1,4};
        triplets(n);
    }
    
}
