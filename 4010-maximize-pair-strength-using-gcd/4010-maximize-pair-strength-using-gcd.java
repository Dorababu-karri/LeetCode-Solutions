class Solution {
    public int gcd(int a,int b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long n1=1L*nums[i]*nums[j];
                int num=gcd(nums[i],nums[j]);
                long n2=1L*num*num;
                ans=Math.max(ans,n1/n2);
            }
        }
        return ans;
    }
}