class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]) count++;
        }
        Map<String,Integer> map=new HashMap<>();
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                int x=Math.min(nums[i-1],nums[i]);
                int y=Math.max(nums[i-1],nums[i]);
                map.put(x+" "+y,map.getOrDefault(x+" "+y,0)+1);
            }
        }
        int max=0;
        for(Integer i:map.values()) max=Math.max(max,i);
        return count+max;
    }
}