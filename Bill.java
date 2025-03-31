import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pen + pencil + eraser;
        float tax = bill*0.18f;
        float total_bill = bill + tax;
        System.out.println("Total bill including tax "+total_bill);
        sc.close();
    }
    
}
