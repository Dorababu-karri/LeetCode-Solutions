class Solution {
    int nums[],dp[][];
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        dp=new int[2][n];
        for(int i=0;i<2;i++) Arrays.fill(dp[i],-1);
        this.nums=nums;
        return Math.max(helper(0,n-2),helper(1,n-1));
    }
    public int helper(int i,int j){
        if(i==j) return nums[i];
        if(i+1==j) return Math.max(nums[i],nums[j]);
        if(j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.max(nums[j]+helper(i,j-2),helper(i,j-1));
    }
}