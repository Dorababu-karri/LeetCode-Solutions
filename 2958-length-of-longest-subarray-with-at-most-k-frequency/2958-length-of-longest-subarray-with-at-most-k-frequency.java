class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int ans=0;
        for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.get(nums[right])>k){
                while(nums[left]!=nums[right] && left<n){
                    map.put(nums[left],map.get(nums[left])-1);
                    if(map.get(nums[left])==0) map.remove(nums[left]);
                    left++;
                }
                left++;
                map.put(nums[right],map.get(nums[right])-1);
                if(map.get(nums[right])==0) map.remove(nums[right]);
            }
            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}