class Solution {
    public String minWindow(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n2>n1) return "";
        int count=n2;
        int left=0;
        int freq[]=new int[128];
        for(char ch:t.toCharArray()) freq[ch]++;
        int st=-1;
        int minLength=n1;
        for(int right=0;right<n1;right++){
            char ch=s.charAt(right);
            if(freq[ch]>0) count--;
            // System.out.println(count);
            freq[ch]--;
            if(count==0){
                while(count==0){
                    int len=right-left+1;
                    ch=s.charAt(left);
                    if(len<=minLength){
                        st=left;
                        minLength=len;
                    }
                    left++;
                    freq[ch]++;
                    if(freq[ch]>0){
                        count++;
                        break;
                    }
                }
            }
        }
        return (st==-1)?"":s.substring(st,st+minLength);
    }
}