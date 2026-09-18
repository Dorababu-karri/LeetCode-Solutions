class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int p1=0,p2=n-1;
        int ans=Integer.MIN_VALUE;
        while(p1<p2){
            int area=(p2-p1)*Math.min(nums[p1],nums[p2]);
            ans=Math.max(area,ans);
            if(nums[p1]<nums[p2]) p1++;
            else p2--;
        }
        return ans;
    }
}