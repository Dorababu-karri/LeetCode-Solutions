class Solution {
    public int minElement(int[] nums) {
        int ans=40;
        for(int i:nums){
            ans=Math.min(ans,digSum(i));
        }
        return ans;
    }
    public int digSum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}