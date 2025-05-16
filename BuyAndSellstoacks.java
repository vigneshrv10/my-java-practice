public class BuyAndSellstoacks {
    public static void buyandsell(int n[]){
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i=0;i<n.length;i++){
            if (buyprice<n[i]){
                int profit = n[i] - buyprice;
                max_profit = Math.max(profit, max_profit);
            }
            else{
                buyprice = n[i];
            }
        }
        System.out.println("Maximum profit acheived : "+max_profit);
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        buyandsell(prices);
    }
    
}
