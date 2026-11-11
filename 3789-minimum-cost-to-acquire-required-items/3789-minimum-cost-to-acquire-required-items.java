class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=Long.MAX_VALUE;
        int min=need1;
        if(min>need2) min=need2;
        if(min==need1){
            long f1=1L*need1*costBoth;
            int n2=need2-need1;
            f1+=(1L*n2*cost2);
            ans=Math.min(f1,ans);
             
        }else{
            long f2=1L*need2*costBoth;
            int n1=need1-need2;
            f2+=(1L*n1*cost1);
            ans=Math.min(f2,ans);
           
        }
        long total=(1L*cost1*need1)+(1L*cost2*need2);
        ans=Math.min(ans,total);
           
        int max=Math.max(need1,need2);
        long both=1L*max*costBoth;
        ans=Math.min(ans,both);
             
        return ans;
    }
}