import java.util.*;
public class Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int number;
        int evensum = 0;
        int oddsum = 0;
        do{
            System.out.print("Enter a number : ");
            number = sc.nextInt();
            if (number%2==0){
                evensum+= number;
            }
            else{
                oddsum+= number;
            }
            System.out.println("Do u want to continue?");
            choice = sc.nextInt();
            if (choice==0){
                break;
            }
            
        }while(choice==1);
        System.out.println("even sum is "+evensum);
        System.out.println("odd sum is "+oddsum);
        sc.close();
    }
    
}
