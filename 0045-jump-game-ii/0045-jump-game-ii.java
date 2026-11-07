class Solution {
    public int jump(int[] nums) {
        int far=0,jumps=0,currEnd=0,n=nums.length;
        for(int i=0;i<n-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==currEnd){
                jumps++;
                currEnd=far;
            }
        }
        return jumps;
    }
}