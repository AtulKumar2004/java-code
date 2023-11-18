// buy and sell stock
public class Arrays15 {
    public static int buyandsellStocks(int prices[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){ // profit
                int profit=prices[i]-buyprice; // today's profit
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4}; // O(prices.length)
        System.out.println(buyandsellStocks(prices));
    }
}