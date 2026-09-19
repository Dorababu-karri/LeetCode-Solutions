class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0,n=s.length();
        int ans=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(set.contains(ch)){
                while(s.charAt(left)!=ch){  
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            set.add(ch);
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}