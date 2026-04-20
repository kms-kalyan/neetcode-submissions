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

    public int maxDepth(TreeNode node){
        if(node == null)
            return 0;
        int r = 1+ maxDepth(node.left);
        int l = 1+ maxDepth(node.right);
        
        return Math.max(l,r);
    }
}
