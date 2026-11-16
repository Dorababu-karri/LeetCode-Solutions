class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        StringBuilder sb1=new StringBuilder(s);
        while(n>k){
            StringBuilder sb2=new StringBuilder();
            int groups=n/k,i=0;
            while(i<n){
                int sum=0;
                for(int j=0;j<k && i<n;j++){
                    sum+=(sb1.charAt(i++)-'0');
                }
                sb2.append(sum);
            }
            sb1.setLength(0);
            sb1.append(sb2.toString());
            sb2.setLength(0);
            n=sb1.length();
        }
        return sb1.toString();
    }
}