public class Bubblesort2 {
    public static void bs(int n[]){
        for (int i=0;i<n.length-1;i++){
            for (int j=0;j<n.length-1-i;j++){
                if (n[j] > n[j+1]){
                    int temp = n[j+1];
                    n[j+1] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    public static void print(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int m[] = {5,4,1,3,2};
        bs(m);
        print(m);
    }
}
