class Solution {
    public int minRotations(String s) {
        
        int initial=0;
        Map<String,Integer> set=new HashMap<>();
        int n=s.length();
        int ans=0;
        set.put("0 0",0);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int num=(int)(ch-'0');
            int min=Math.min(initial,num);
            int max=Math.max(initial,num);
            String find=min+" "+max;
            if(!set.containsKey(find)){
                set.put(find,Math.min(max-min,10-(max-min)));
            } 
            ans+=set.get(find);
            initial=num;
        }
        return ans;
    }
}