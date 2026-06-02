class Solution {
    Boolean dp[][];
    int n;
    public boolean canPartition(int[] nums) {
        n=nums.length;
        int sum=0;
        for(int i:nums) sum+=i;
        dp=new Boolean[n][sum+1];
         
        return helper(nums,0,0,sum);
    }
    public boolean helper(int nums[],int i,int curr,int rem){
        if(i==n){
            if(curr==rem) return true;
            return false;
        }
        if(dp[i][curr]!=null) return dp[i][curr];
        boolean skip=helper(nums,i+1,curr,rem);
        boolean take=helper(nums,i+1,curr+nums[i],rem-nums[i]);
        return dp[i][curr]= skip || take;
    }
}