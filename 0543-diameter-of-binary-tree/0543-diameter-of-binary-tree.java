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
    private int maxdistance=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxdistance;
    }
    private int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=getHeight(root.left);
        int rightheight=getHeight(root.right);
        maxdistance = Math.max(maxdistance, leftheight + rightheight);
        return 1+Math.max(leftheight,rightheight);
    }
}