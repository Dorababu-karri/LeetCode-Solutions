class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int p1=i+1;
            int p2=n-1;
            while(p1<p2){
                int target=nums[i]+nums[p1]+nums[p2];
                if(target == 0){
                    ans.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    p1++;
                    while(p1<p2 && nums[p1-1]==nums[p1]) p1++;
                }else if(target>0){
                    p2--;
                }else{
                    p1++;
                }
            }
        }
        return ans;
    }
}