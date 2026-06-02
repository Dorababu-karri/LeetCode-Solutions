class Solution {
    Boolean dp[][];
    int n,sum;
    public boolean canPartition(int[] nums) {
        n=nums.length;
         sum=0;
        for(int i:nums) sum+=i;
        dp=new Boolean[n][sum+1];
         
        return helper(nums,0,0);
    }
    public boolean helper(int nums[],int i,int curr){
        if(i==n){
            int rem=sum-curr;
            if(curr==rem) return true;
            return false;
        }
        if(dp[i][curr]!=null) return dp[i][curr];
        boolean skip=helper(nums,i+1,curr);
        boolean take=false;
        int rem=sum-curr;
        if(curr<=rem)
            take=helper(nums,i+1,curr+nums[i]);
        return dp[i][curr]= skip || take;
    }
}