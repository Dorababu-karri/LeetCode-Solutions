class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        int pair[]=new int[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(i);
            else if(ch==')'){
                int j=st.pop();
                pair[i]=j;
                pair[j]=i;
            }
        }
        int i=0,dir=1;
        StringBuilder sb=new StringBuilder();
        while(i>=0 && i<n){
            char ch=s.charAt(i);
            if(ch=='(' || ch==')'){
                i=pair[i];
                dir=-dir;
            }else{
                sb.append(ch);
            }
            i+=dir;
        }
        return sb.toString();
    }
}