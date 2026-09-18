class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int suff[]=new int[n];
        suff[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i];
        }
        int ans[]=new int[n];
        int pre=1;
        for(int i=0;i<n;i++){
             
            if(i==n-1){
                ans[i]=pre;
                continue;
            }
            ans[i]=pre*suff[i+1];
            pre*=nums[i];
        }
        return ans;
    }
}