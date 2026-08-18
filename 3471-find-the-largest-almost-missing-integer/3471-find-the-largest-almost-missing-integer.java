class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k>n) return -1;
        if(n==k){
            int ans=-1;
            for(int i:nums) ans=Math.max(ans,i);
            return ans;
        }
         int[] count = new int[51];
        for (int x : nums) {
            count[x]++;
        }
        if (k == 1) {
            for (int i = 50; i >= 0; --i) {
                if (count[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
        int k1=nums[0];
        int e1=k1;
        for(int i=1;i<n;i++){
            if(nums[i]==k1) e1=-1;
        }
        int k2=nums[n-1];
        int e2=k2;
        for(int i=n-2;i>=0;i--){
            if(nums[i]==k2) e2=-1;
        }
        return Math.max(e1,e2);
    }
}