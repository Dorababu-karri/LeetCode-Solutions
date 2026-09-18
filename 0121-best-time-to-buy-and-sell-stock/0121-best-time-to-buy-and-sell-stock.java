class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int sell=buy;
        int ans=0;
        for(int i=1;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
                sell=buy;
                continue;
            }
            if(sell<prices[i]) sell=prices[i];
            ans=Math.max(ans,sell-buy);
        }
        return ans;
    }
}