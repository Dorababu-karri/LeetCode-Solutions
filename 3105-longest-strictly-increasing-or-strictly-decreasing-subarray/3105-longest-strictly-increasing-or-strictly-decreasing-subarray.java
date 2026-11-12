class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c=1,n=nums.length,ans=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                c++;
            }else{
                ans=Math.max(c,ans);
                c=1;
            }
        }
        ans=Math.max(c,ans);
        c=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                c++;
            }else{
                ans=Math.max(c,ans);
                c=1;
            }
        }
        ans=Math.max(c,ans);
        return ans;
    }
}