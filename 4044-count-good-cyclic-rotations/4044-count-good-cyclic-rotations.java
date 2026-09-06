class Solution {
    public int countGoodRotations(int[] nums) {
        long sum1=0,sum2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i<n/2) sum1+=nums[i];
            else sum2+=nums[i];
        }
        int count=0,j=n/2;
        for(int i=0;i<n;i++){
            sum1=sum1-nums[i]+nums[j];
            sum2=sum2+nums[i]-nums[j];
            if(sum1>sum2) count++;
            j=(j+1)%n;
        }
        return count;
    }
}