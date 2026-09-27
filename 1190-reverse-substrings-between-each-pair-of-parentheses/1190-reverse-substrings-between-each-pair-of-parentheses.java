class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder rev=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=sb.length()-1;
            if(ch==')'){
                while(sb.charAt(idx)!='('){
                    rev.append(sb.charAt(idx));
                    sb.deleteCharAt(idx);
                    idx--;
                }
                sb.deleteCharAt(idx);
                sb.append(rev);
                rev.setLength(0);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}