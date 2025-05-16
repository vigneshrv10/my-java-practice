public class DistinctArray {
    public static void distinct(int n[]){
        boolean not_distinct_cond = false;
        for (int i=0;i<n.length;i++){
            if (i<n.length-1){
                int comp1 = n[i];
                for (int j=i+1;j<n.length;j++){
                    int comp2 = n[j];
                    if (comp1 == comp2){
                        not_distinct_cond = true;
                        break;
                    }
                }
            }
        }
        System.out.println("The statment of telling that array is distinct is : "+not_distinct_cond);
    }
    public static void main(String[] args) {
        int n[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        distinct(n);
    }
    
}
