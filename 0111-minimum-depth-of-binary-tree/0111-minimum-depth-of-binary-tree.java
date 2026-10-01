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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int depth=1;
        Deque<TreeNode> dq=new ArrayDeque<>();
        dq.add(root);
        while(!dq.isEmpty()){
            int size=dq.size();
            while(size-->0){
                TreeNode node=dq.poll();
                if(node.left==null && node.right==null) return depth;
                if(node.left!=null) dq.add(node.left);
                if(node.right!=null) dq.add(node.right);
            }
            depth++;
        }
        return 0;
    }
     
}