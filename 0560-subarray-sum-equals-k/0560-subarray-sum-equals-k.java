class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pre=0,ans=0;
        for(int i=0;i<n;i++){
            pre+=nums[i];
            int target=pre-k;
            if(map.containsKey(target)) ans+=map.get(target);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return ans;
    }
}