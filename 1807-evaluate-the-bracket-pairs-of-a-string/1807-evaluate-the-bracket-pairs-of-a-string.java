class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int st=-1;
        int n=s.length();
        Map<String,String> map=new HashMap<>();
        for(List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='(') 
            {
                st=i+1;
                while(s.charAt(i)!=')'){
                    i++;
                }
                String str=s.substring(st,i);
                if(map.containsKey(str)) sb.append(map.get(str));
                else sb.append('?');
            }
            else{
                sb.append(ch);
            }
            i++;    

        }
        return sb.toString();
    }
}