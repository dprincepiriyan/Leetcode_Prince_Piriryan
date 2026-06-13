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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> currentPath=new ArrayList<>();
        helper(root,targetSum,currentPath,result);
        return result;

    }
    private void helper(TreeNode root, int targetSum,List<Integer> currentPath,List<List<Integer>>result){
        if(root==null){
            return;
        }
        currentPath.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                result.add(new ArrayList<>(currentPath));
            }
            currentPath.remove(currentPath.size() - 1);
            return;
        }
        helper(root.left,targetSum-root.val,currentPath,result);
        helper(root.right,targetSum-root.val,currentPath,result);
        currentPath.remove(currentPath.size() - 1);
    }
}