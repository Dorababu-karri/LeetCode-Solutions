class Solution {
    public String frequencySort(String s) {
        // Convert to Character array
        Character[] ch = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:ch){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // Now this will work
        Arrays.sort(ch, (a, b) -> {
            int f1 = map.get(a);
            int f2 = map.get(b);
            if(f1==f2) return a-b;
            return f2 - f1;
        });
        StringBuilder sb=new StringBuilder();
        for(char i:ch){
             sb.append(i);
        }
        return sb.toString();
    }
}