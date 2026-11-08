class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        int n=s1.length();
        int st=-1;
        for(int i=0;i<n;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1==ch2 && st!=-1){
               List<String> l=new ArrayList<>();
               l.add(s1.substring(st,i));
               l.add(s2.substring(st,i));
               ans.add(l);
               st=-1;
            }
            else if(ch1!=ch2 && st==-1) st=i;
            if(i==n-1 && st!=-1){
               List<String> l=new ArrayList<>();
               l.add(s1.substring(st,n));
               l.add(s2.substring(st,n));
               ans.add(l);
               st=-1;
            }
        }
        return ans;
    }
}