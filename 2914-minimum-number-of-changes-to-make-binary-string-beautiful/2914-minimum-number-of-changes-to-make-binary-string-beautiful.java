class Solution {
    public int minChanges(String s) {
        int ans=0,n=s.length();
        for(int i=0;i<n;i+=2){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1!=ch2) ans++;
        }
        return ans;
    }
}