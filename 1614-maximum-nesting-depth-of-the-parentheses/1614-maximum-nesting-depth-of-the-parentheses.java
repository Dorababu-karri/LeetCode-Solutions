class Solution {
    public int maxDepth(String s) {
        int left=0,right=0;
        int n=s.length();
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') left++;
            else if(ch==')') right++;
            ans=Math.max(left-right,ans);
        }
        return ans;
    }
}