import java.util.Scanner;

public class CircularPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int rotateNumber(int n) {
        String s = String.valueOf(n);
        if (s.length() <= 1) {
            return n;
        }
        char firstDigit = s.charAt(0);
        String remainingDigits = s.substring(1);
        return Integer.parseInt(remainingDigits + firstDigit);
    }

    public static boolean isCircularPrime(int num) {
        if (!isPrime(num)) {
            return false; 
        }

        int originalNum = num;
        int currentRotation = num;
        int numDigits = String.valueOf(num).length();

        for (int i = 0; i < numDigits; i++) {
            currentRotation = rotateNumber(currentRotation);
            if (!isPrime(currentRotation)) {
                return false;
            }
            if (currentRotation == originalNum && i < numDigits - 1) {
               
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isCircularPrime(number)) {
            System.out.println(number + " is a Circular Prime number.");
        } else {
            System.out.println(number + " is not a Circular Prime number.");
        }
        sc.close();
    }
}