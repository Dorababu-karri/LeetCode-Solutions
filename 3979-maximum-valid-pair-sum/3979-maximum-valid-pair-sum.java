class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int suf[]=new int[n];
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(nums[i],suf[i+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(i+k<n){
                ans=Math.max(ans,nums[i]+suf[i+k]);
            }
        }
        return ans;
    }
}