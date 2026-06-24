class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int farthest=0;
        for(int i=0;i<n;i++){
            if(farthest<i) return false;
            int num=i+nums[i];
            farthest=Math.max(farthest,num);
        }
        return farthest>=n-1;
    }
}