class Solution {
    public int reverseDegree(String s) {
        long sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx='z'-ch+1;
            long curr=(i+1)*1L*idx;
            sum+=curr;
        }
        return (int)sum;
    }
}