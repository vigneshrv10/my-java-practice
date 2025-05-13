public class Largestnuminarr {
    public static int largest(int n[]){
        int largestnum = Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            if (n[i]>largestnum){
                largestnum = n[i];
            }
        }
        return largestnum;
    }
    public static int smallest(int n[]){
        int smallestnum = Integer.MAX_VALUE;
        for (int i=0;i<n.length;i++){
            if (n[i]<smallestnum){
                smallestnum = n[i];
            }
        }
        return smallestnum;
    }
    public static void main(String[] args) {
        int numbers[] = {69,72,-5,666,8446};
        System.out.println("Largest : "+largest(numbers));
        System.out.println("Smallest : "+smallest(numbers));

    }

    
}
