class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> l=new ArrayList<>();
            if(i==0)
            { 
                l.add(1);
            }
            else if(i==1){
                l.add(1);
                l.add(1);
            }
            else{
                l.add(1);
                List<Integer> p=ans.get(i-1);
                for(int j=1;j<i;j++){
                     l.add(p.get(j-1)+p.get(j));
                }
                l.add(1);
            }
            ans.add(l); 
        }
        return ans.get(ans.size()-1);
    }
}
  