class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(s.substring(i+1,n));
            sb.append(s.substring(0,i+1));
            String s1=sb.toString();
            int score=0;
            for(int j=0;j<n-1;j++){
                char ch1=s1.charAt(j);
                char ch2=s1.charAt(j+1);
                if(ch1==ch2) score++;
            }
            if(score==k) count++;
        }
        return count;
    }
}