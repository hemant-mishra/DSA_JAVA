public class maxProfit {
    public static void main(String args[]){
    int[] prices={7,1,5,3,6,4,7,0};
    int minPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<minPrice){
            minPrice=prices[i];
        }
        else if(prices[i]-minPrice>maxProfit){
            maxProfit=prices[i]-minPrice;
        }
    }
    System.out.println(maxProfit);
    
}
}
