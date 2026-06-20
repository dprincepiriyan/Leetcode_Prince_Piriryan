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
    private int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex=0;
        return build(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int[] inorder, int start, int end){
        if(start>end){
            return null;
        }
        int rootval=preorder[preIndex];
        preIndex++;
        TreeNode root=new TreeNode(rootval);
        int rootIndex=start;
        for(int i=start;i<=end;i++){
            if(inorder[i]==rootval){
                rootIndex=i;
            }
        }
        root.left = build(preorder, inorder, start, rootIndex - 1);
        root.right = build(preorder, inorder, rootIndex + 1, end);
        return root;
    }
}