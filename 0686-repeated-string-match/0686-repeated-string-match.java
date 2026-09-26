class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n=a.length();
        int n2=b.length();
        int n1=n;
        int count=1;
        if(a.contains(b)) return 1;
        StringBuilder sb=new StringBuilder();
        sb.append(a);
        while(n1<=(n2+n)){
            sb.append(a);
            String s=sb.toString();
            count++;
           if(s.contains(b)) return count;
           n1=s.length();
        }
        return -1;
    }
}