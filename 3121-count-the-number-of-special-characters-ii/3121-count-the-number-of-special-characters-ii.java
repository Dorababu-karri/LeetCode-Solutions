class Solution {
    public int numberOfSpecialChars(String word) {
        int a[]=new int[26];
        int B[]=new int[26];
        int n=word.length();
        Arrays.fill(a,-1);
        Arrays.fill(B,-1);
        for(int i=0;i<n;i++){
             char ch=word.charAt(i);
             if(Character.isUpperCase(ch)){
                if(B[ch-'A']==-1)
                    B[ch-'A']=i;
             }else{
                a[ch-'a']=i;
             }
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(a[i]<B[i] && (a[i]!=-1 && B[i]!=-1)) ans++;
        }
        return ans;
    }
}