class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int n=nums.length;
        long mul=1;
        int ans=0;
        for(int right=0;right<n;right++){
            mul*=nums[right];
            while(left<n && mul>=k){
                mul/=nums[left];
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }
}