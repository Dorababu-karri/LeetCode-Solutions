class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        if(n==3) return 0;
        Arrays.sort(nums);
        int ans1=nums[n-3]-nums[0];
        int ans2=nums[n-2]-nums[1];
        int ans3=nums[n-1]-nums[2];
        return Math.min(ans1,Math.min(ans3,ans2)); 
    }
}