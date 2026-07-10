class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,left=0,ans=0;
        for(int right=0;right<n;right++){
            int num=nums[right];
            if(num==0) k--;
            while(k<0 && nums[right]==0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }

            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}