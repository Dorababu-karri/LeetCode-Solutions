class Solution {
    public int minMergedInteger(int[] nums) {
        int ans=10001001;
        for(int i=1;i<nums.length;i+=2){
            int num=nums[i-1];
            int val=nums[i];
            int dig=0;
            while(val>0){
                 val/=10;
                 dig++;
            }
            num=num*(int)Math.pow(10,dig);
            num+=nums[i];
            ans=Math.min(ans,num);
        }
        return ans;
    }
}