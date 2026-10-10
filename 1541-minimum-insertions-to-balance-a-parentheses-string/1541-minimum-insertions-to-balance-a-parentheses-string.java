class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int i=0,ans=0;
        Stack<Character> st=new Stack<>();
        while(i<n){
            char ch=s.charAt(i);
           
            if(i==n-1){
                if(ch=='('){
                    st.push('(');
                }
                else if(ch==')'){
                    if(st.isEmpty()){
                        ans+=2;
                    }else{
                        st.pop();
                        ans+=1;
                    }
                }
                break;
            }
            char ch1=s.charAt(i+1);
            if(ch=='('){
                st.push('(');
            }else if(ch==')' && ch1==')'){
                if(st.isEmpty()){
                        ans+=1;
                }else{
                    st.pop();
                }
                i++;
            }else if(ch==')'){
                if(st.isEmpty()){
                        ans+=2;
                }else{
                    st.pop();
                    ans+=1;
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            ans+=2;
            st.pop();
        }
        return ans;
    }
}