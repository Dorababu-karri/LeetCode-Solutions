class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                if(Character.isUpperCase(ch)){
                    sb.append((char)((ch-'A')+'a'));
                }else{
                    sb.append(ch);
                }
            }
        }
        String str=sb.toString();
        int p1=0,p2=str.length()-1;
        System.out.println(str);
        while(p1<p2){
            if(str.charAt(p1)!=str.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
}