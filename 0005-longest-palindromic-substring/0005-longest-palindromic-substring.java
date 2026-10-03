class Solution {
    static String s;
    static int n;
    public String longestPalindrome(String s) {
        this.s=s;
        int ans=0;
        int start=0;
        this.n=s.length();
        for(int i=0;i<n;i++){
            int[] odd=isPalindrome(i,i);
            int[] even=isPalindrome(i,i+1);
            if(odd[1]>ans){
                start=odd[0];
                ans=odd[1];
            }
            if(even[1]>ans){
                start=even[0];
                ans=even[1];
            }
            System.out.println(odd[1]+" "+even[1]);
        }
        return s.substring(start,start+ans);
    }
    public int[] isPalindrome(int left,int right){
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        System.out.println(left+" "+right);
        return new int[]{left+1,right-left-1};
    }
}