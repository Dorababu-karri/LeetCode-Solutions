class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums) arr[i]+=1;
        int n=nums.length;
        int ans[]=new int[n];
        int count=0;
        int j=0;
        while(count!=n){
            for(int i=0;i<=100;i++){
                if(arr[i]>0){
                    ans[j++]=i;
                    count++;
                    arr[i]--;
                }
            }
        }
        return ans;
    }
}