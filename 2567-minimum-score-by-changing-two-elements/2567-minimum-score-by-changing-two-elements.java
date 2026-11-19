class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        if(n==3) return 0;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,min3=Integer.MAX_VALUE;
        int max1=0,max2=0,max3=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min1){
                min3=min2;
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
                min3=min2;
                min2=nums[i];
            }else if(nums[i]<min3){
                min3=nums[i];
            }
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>max3){
                max3=nums[i];
            }
        }
        int ans1=max3-min1;
        int ans2=max2-min2;
        int ans3=max1-min3;
        return Math.min(ans1,Math.min(ans3,ans2)); 
    }
}