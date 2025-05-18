public class BubbleSort{
    public static void bs(int n[]){
        for (int turn=0;turn<n.length-1;turn++){
            for (int j=0;j<n.length-1-turn;j++){
                if (n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sort implemented");
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,2,58};
        bs(arr);
        print(arr);
    }
}