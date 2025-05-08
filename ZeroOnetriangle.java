public class ZeroOnetriangle {
    public static void main(String[] args) {
        int value = 1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(value);
                if (value==1){
                    value=0;
                }
                else{
                    value=1;
                }
            }
            System.out.println();
        }
    }
    
}
