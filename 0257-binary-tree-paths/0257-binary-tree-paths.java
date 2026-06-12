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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        constructPath(root,"",result);
        return result;
    }
    private void constructPath(TreeNode root,String path,List<String> result){
        if(root==null){
            return;
        }
        path+=root.val;

        if(root.left==null && root.right==null){
            result.add(path);
            return;
        }
        constructPath(root.left,path+"->",result);
        constructPath(root.right,path+"->",result);

    }
}