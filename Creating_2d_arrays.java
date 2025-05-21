import java.util.*;
public class Creating_2d_arrays {
    public static void print(int n[][]){
        for(int i=0;i<n.length;i++){
            for (int j=0;j<n[0].length;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void search(int n[][],int key){
        for(int i=0;i<n.length;i++){
            boolean found = false;
            for (int j=0;j<n[0].length;j++){
                if (n[i][j]==key){
                    System.out.println("Element found at "+i+","+j);
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Enter the elem for "+i+" th row and "+j+" th col : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        print(matrix);
        System.out.print("Enter the key u want to find : ");
        int key = sc.nextInt();
        search(matrix, key);
        sc.close();
    }
}