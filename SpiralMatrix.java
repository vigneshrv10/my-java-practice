public class SpiralMatrix {
    public static void spiral(int n[][]){
        int sr = 0;
        int sc = 0;
        int er = n.length-1;
        int ec = n[0].length-1;
        while (sr<=er && sc<=ec){
            for (int j=sc;j<=ec;j++){
                System.out.print(n[sr][j]+" ");
            }
            for (int i=sr+1;i<=er;i++){
                System.out.print(n[i][ec]+" ");
            }
            for (int j=ec-1;j>=sc;j--){
                System.out.print(n[er][j]+" ");
            }
            for (int i=er-1;i>=sr+1;i--){
                System.out.print(n[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix);
    }
    
}
