public class DiagonalSum {
    public static int sum(int n[][]){
        int sum = 0;
        for (int i=0;i<=n.length-1;i++){
            sum += n[i][i];
            if (i!= n.length-1-i){
                sum += n[i][n.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(sum(matrix));
    }
    
}
