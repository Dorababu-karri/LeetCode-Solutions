class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int idx=0,bal=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(bal==0) idx=i;
            if(ch=='(') bal++;
            else bal--;
            if(bal==0){
                sb.append(s.substring(idx+1,i));
            }
        }
        return sb.toString();
    }
}