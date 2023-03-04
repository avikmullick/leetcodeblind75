package leetcodeblind751.array;

public class StockBuySell {
  public int maxProfit(int[] prices) {
    int profit=0;
    int buy=prices[0];
    int sell=prices[0];
    for(int i=1;i<prices.length;i++){
      sell=prices[i];
      if(buy<=sell){
        int p=sell-buy;
        if(p>profit){
          profit=p;
        }
      } else {
        buy=prices[i];
      }
    }
    return profit;
  }

  public static void main(String args[]){
    StockBuySell stockBuySell=new StockBuySell();
    System.out.println(stockBuySell.maxProfit(new int[]{7,1,5,3,6,4}));
    System.out.println(stockBuySell.maxProfit(new int[]{7,6,4,3,1}));
  }
}
