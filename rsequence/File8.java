import java.util.*;
public class File8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrray : ");
        int n = sc.nextInt();
        int myarr[] = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            myarr[i] = sc.nextInt();
            sum += myarr[i];
        }
        System.out.println("Sum of array is : "+sum);
        System.out.print("Your array is : ");
        for(int i=0;i<n;i++){
            System.out.print(myarr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(myarr[j]>myarr[j+1]){
                    int temp = myarr[j+1];
                    myarr[j+1] = myarr[j];
                    myarr[j] = temp;
                }
            }
        }
        System.out.print("Your Sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(myarr[i]+" ");
        }
        sc.close();
    }
}
