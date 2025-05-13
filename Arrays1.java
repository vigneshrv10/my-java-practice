/*
 * arrays are 0-index based. 
 * arrays definition - 
 * list of elements having same datatype placed in contiguos memory location.
 * for ex : {9,98,"vignesh"} // this is not array bcoz having string also in int array
 * for ex we want to strore {97,98,99} array in our m/y space then each integer takes 4 bytes and for sample
 * their m/y locations will be 1000,1004,1008 respectively bcoz contigous and each elem takes 4 bytes
 * - operations in array - create, input, output, update * 
 * 
 */
import java.util.*;
public class Arrays1 {
    public static void update(int marks[],int n){
        n = 10; // changed 5 to 10 just with in fn.
        for (int i=0;i<marks.length;i++){
            marks[i] +=1;
        }
    }
    public static void print(int arr[]){
        for (int j=0;j<arr.length;j++){
            System.out.println("mark no "+j+" : "+arr[j]);
        }
    }
    public static void main(String[] args) {
        // // // array creation syntax - dataType arrayname[] = new dataType[size]; or simply dataType arrayname = {elements in array...}
        // int marks[] = new int[50]; // declared 50 as size of array and it cant be changed in runtime
        // // before assinging values in marks [] , defaulty 50 null values will be there.
        // int numbers[] = {97,98,99};
        // String fruits[] = {"apple","mango","pomogrenate"};
        // int marks[] = new int[50];
        int marks[] = new int[3];
        int n = 5;
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        print(marks);
        System.out.println(n);
        update(marks, n);
        System.out.println(n); // array elements will be changed but not n
        print(marks); // array is changed due to reference but not applied to n
        sc.close();
    }
}