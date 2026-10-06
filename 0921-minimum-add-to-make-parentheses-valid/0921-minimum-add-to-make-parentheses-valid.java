class Solution {
    public int minAddToMakeValid(String s) {
        int  ans=0,bal=0,n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                bal++;
            }else{
                bal--;
            }
            if(bal==-1){
                ans+=-bal;
                bal=0;
            }
        }
        return ans+bal;
    }
}