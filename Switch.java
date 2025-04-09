public class Switch {
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 1: System.out.println("burger");
                    break; // if break is not there means then it also runs following cases
            case 2: System.out.println("mangoshake");
                    break;
            case 3: System.out.println("pizza");
                    break;
            default: System.out.println("we are dreaming");
        }
    }
    
}
