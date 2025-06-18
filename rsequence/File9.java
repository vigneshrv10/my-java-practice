import java.util.*;
public class File9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the times of rotation : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int myarr[] = new int[size];
        for(int i=0;i<size;i++){
            myarr[i] = sc.nextInt();
        }
        System.out.println("Your array is : ");
        for(int i=0;i<size;i++){
            System.out.println(myarr[i]);
        }
        while(n>0){
            int temp = myarr[0];
            for(int i=1;i<size;i++){
                myarr[i-1] = myarr[i];
            }
            myarr[size-1] = temp;
            n--;
        }
        System.out.println("Your rotated array is : ");
        for(int i=0;i<size;i++){
            System.out.println(myarr[i]);
        }
        sc.close();
    }
}
