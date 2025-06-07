public class BitwiseOperators {
    public static void oddoreven(int n){
        int bitmask = 1;
        if ((n & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        /*
         * There are different bitwise opearators like bitwise and,
         * bitwise or, xor, 1's complement, left shift, right shift
         */
        System.out.println(5 & 6); // and
        System.out.println(5 | 6); // or
        System.out.println(5 ^ 6); // xor
        System.out.println(~0);
        System.out.println(~5);
        System.out.println(5<<2); // 20
        System.out.println(6>>1);
        oddoreven(6);
        


    }
    
}
