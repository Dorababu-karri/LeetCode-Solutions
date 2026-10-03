class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char arr[]=new char[26];
            StringBuilder sb=new StringBuilder();
            for(char ch:str.toCharArray()) arr[ch-'a']+=1;
            for(int i=0;i<26;i++){
                sb.append(arr[i]+" ");
            }
            map.computeIfAbsent(sb.toString(),key->new ArrayList<>()).add(str);
        } 
        List<List<String>> ans=new ArrayList<>();
        for(List<String> list:map.values()) ans.add(list);
        return ans;
    }
}