class Solution {
    public boolean equalFrequency(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            int cnt[]=new int[26];
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<n;j++){
                if(i==j) continue;
                char ch=s.charAt(j);
                cnt[ch-'a']+=1;
            }
            for(int k=0;k<26;k++){
                if(cnt[k]!=0) set.add(cnt[k]);
            }

            if(set.size()==1) return true;
        }
        return false;
    }
}