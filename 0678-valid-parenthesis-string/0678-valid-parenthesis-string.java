class Solution {
    static String s;
    static int n;
    static Map<String,Boolean> dp;
    public boolean checkValidString(String s) {
        this.s=s;
        this.n=s.length();
        dp=new HashMap<>();
        return helper(0,0);
    }
    public boolean helper(int i,int bal){
        if(i==n) return bal==0;
        char ch=s.charAt(i);
        if(bal<0) return false;
        String key=i+" "+bal;
        if(dp.containsKey(key)) return dp.get(key);
        boolean ans=false;
        if(ch=='*'){
            ans=helper(i+1,bal+1) || helper(i+1,bal-1) || helper(i+1,bal);
        }else if(ch=='('){
            ans=helper(i+1,bal+1);
        }else{
            ans=helper(i+1,bal-1);
        }
        dp.put(key,ans);
        return ans;
    }
}