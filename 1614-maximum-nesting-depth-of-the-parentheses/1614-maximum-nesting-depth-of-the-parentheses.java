class Solution {
    public int maxDepth(String s) {
        int left=0;
        int n=s.length();
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') left++;
            else if(ch==')') left--;
            ans=Math.max(left,ans);
        }
        return ans;
    }
}