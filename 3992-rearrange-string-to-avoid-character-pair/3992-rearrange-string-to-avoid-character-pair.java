class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(char i:s.toCharArray()){
            if(y==i) c++;
        }
        while(c-->0) sb.append(y);
        for(char i:s.toCharArray()){
            if(y!=i){
                sb.append(i);
            }
        }
    return sb.toString();
    }
}