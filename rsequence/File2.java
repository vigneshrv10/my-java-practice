import java.util.*;
public class File2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pen : ");
        int cost = sc.nextInt();
        int pens_cost = 70*cost;
        float discount;
        if (pens_cost>1000){
            discount = pens_cost*0.2f;
            
        }
        else{
            discount = pens_cost*0.1f;
        }
        System.out.println("Total cost is : "+(pens_cost - discount));
        sc.close();
    }
    
}
