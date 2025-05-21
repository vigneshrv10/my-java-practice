import java.util.*;
public class TransposeMatrix {
    public static void print(int n[][]){
        for (int i=0;i<n.length;i++){
            for (int j=0;j<n[0].length;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int n[][]){
        int rows = n.length, cols = n[0].length;
        int transposedmatrix[][] = new int[cols][rows];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                transposedmatrix[j][i] = n[i][j];
            }
        }
        System.out.println("Your transposed matrix is : ");
        print(transposedmatrix);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of cols : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Enter the "+i+","+j+" : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix is : ");
        print(matrix);
        transpose(matrix);
        sc.close();
    }

}