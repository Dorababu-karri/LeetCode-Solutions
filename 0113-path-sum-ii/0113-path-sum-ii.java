/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static List<List<Integer>> ans;
    static int k,sum=0;
    static List<Integer> list;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        list=new ArrayList<>();
        this.k=targetSum;
        if(root==null) return ans;
        list.add(root.val);
        Dfs(root,root.val);
        return ans;
        
    }
    public void Dfs(TreeNode root,int sum){
        if(sum==k){
            if(root.left==null && root.right==null)
            ans.add(new ArrayList<>(list));
        }
        if(root.left!=null){
            list.add(root.left.val);
            Dfs(root.left,sum+root.left.val);
            list.remove(list.size()-1);
             
        }
        if(root.right!=null){
           list.add(root.right.val); 
            Dfs(root.right,sum+root.right.val);
            list.remove(list.size()-1);
        }

    }
}