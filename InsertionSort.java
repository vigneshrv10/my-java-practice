public class InsertionSort {
    public static void is(int n[]){
        for (int i=1;i<n.length;i++){
            int current = n[i];
            int previous = i - 1;
            while(previous>=0 && n[previous] > current){
                n[previous+1] = n[previous];
                previous--;
            }
            n[previous + 1] = current;
        }
        System.out.println("Insertion Sort completed ");
    }
    public static void print(int m[]){
        for (int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int m[] = {5,4,1,3,2};
        is(m);
        print(m);
    }
    
}
