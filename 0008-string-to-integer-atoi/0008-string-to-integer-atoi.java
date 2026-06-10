class Solution {
    int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
    public int myAtoi(String input) {
        // Your code goes here
        String s=input.trim();
        if(s.isEmpty()) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign=(s.charAt(i)=='+')?1:-1;
            i++;
        }
        return helper(s,i,0,sign);
    }
    public int helper(String s,int i,long num,int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }
        char ch=s.charAt(i);
        num=num*10+ch-'0';
       if(sign*num<=min) return min;
       if(sign*num>=max) return max;
        return helper(s,i+1,num,sign);

    }
}