class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int fmin=-1,fmax=-1;
        int n=nums.length;
        for(int i:nums) {
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        for(int i=0;i<n;i++){
            if(fmin!=-1 && fmax!=-1) break;
            if(nums[i]==min && fmin==-1) fmin=i+1;
            if(nums[i]==max && fmax==-1) fmax=i+1;

        }
        int bmin=-1,bmax=-1;
    
        for(int i=n-1;i>=0;i--){
            if(bmin!=-1 && bmax!=-1) break;
            if(nums[i]==min && bmin==-1) bmin=n-i;
            if(nums[i]==max && bmax==-1) bmax=n-i;

        }
        int ans1=Math.max(fmin,fmax);
        int ans2=Math.max(bmin,bmax);
        int ans3=Math.min(fmin,bmin)+Math.min(fmax,bmax);
        return Math.min(ans1,Math.min(ans2,ans3));
    }
}