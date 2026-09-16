class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx!=-1){
            int num=nums[idx];
            for(int i=n-1;i>=0;i--){
                if(nums[i]>num){
                    nums[idx]=nums[i];
                    nums[i]=num;
                    break;
                }
            }
        }
        int mid=((idx+1)+(n-1))/2;
        int j=0;
        for(int i=idx+1;i<=mid;i++){
                int temp=nums[n-j-1];
                nums[n-j-1]=nums[i];
                nums[i]=temp;
                j++;
        }
    }
}