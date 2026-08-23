class Solution {
    public int elevatorRequests(int n, int[] nums) {
        int ans=0;
        int len=nums.length;
        ans+=nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]) ans+=Math.abs(nums[i]-nums[i-1]);
        }
        return ans;
    }
}