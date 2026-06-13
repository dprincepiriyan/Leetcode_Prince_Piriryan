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
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean validate(TreeNode root, long min_value,long max_value){
        if(root==null){
            return true;
        }
        if(root.val<=min_value || root.val>=max_value){
            return false;
        }
        return validate(root.left,min_value,root.val) && validate(root.right,root.val,max_value);
    }
}