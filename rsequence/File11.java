import java.util.*;
public class File11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();
        System.out.println("Enter the elements of array");
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the element for "+i+"th rows and "+j+"th col : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your array is : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Your matrix after row wise sorting is : ");
        for(int i=0;i<rows;i++){
            Arrays.sort(matrix[i]);
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
