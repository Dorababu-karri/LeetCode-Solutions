class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        long pre=0;
        for(int i=0;i<n;i++){
            int b=target-nums[i];
            if(map.containsKey(b)){
                return new int[]{i,map.get(b)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}