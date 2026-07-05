class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=nums.length/2;
        return map.get(nums[n])==1;
    }
}