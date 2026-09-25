class Solution {
    static int n,stones[],prefix[],dp[];
    public String stoneGameIII(int[] stoneValue) {
        this.stones=stoneValue;
        this.n=stones.length;
        prefix=new int[n+1];
        dp=new int[n];
        Arrays.fill(dp,Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+stones[i];
        }
        int alice=function(0);
        int bob=prefix[n]-alice;
        if(bob==alice) return "Tie";
        return (alice>bob)?"Alice":"Bob";
    }
    public int function(int idx){
        if(idx>=n) return 0;

        int maxStones=Integer.MIN_VALUE;
        if(dp[idx]!=maxStones) return dp[idx];
        for(int X=1;X<=3 && (idx+X)<=n;X++){
            int currentStones=prefix[idx+X]-prefix[idx];
            int totalRemaining=prefix[n]-prefix[idx+X];
            int nextStones=function(idx+X);
            maxStones=Math.max(maxStones,currentStones+totalRemaining-nextStones);

        }
        return dp[idx]=maxStones;
    }
}