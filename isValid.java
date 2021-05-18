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
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        return isValid(root);
        
        
    }
    private boolean isValid(TreeNode root){
        if(root == null) return true;
        
        //left recursive call
        if(isValid(root.left) == false) return false;
        System.out.println(root.val);
        //logic
        if(prev != null && prev.val >= root.val) return false;
        prev = root;
        
        //right recursive call
        return isValid(root.right);
        
    }
}
