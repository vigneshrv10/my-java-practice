import java.util.*;
public class File16 {
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
        sc.close();
        System.out.println("Your format is : ");
        for(int i=0;i<rows;i++){
            if(i%2==0){
                for(int j=0;j<cols;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else{
                for(int j=cols-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
    
}
