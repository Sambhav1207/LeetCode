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
    public TreeNode bstToGst(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode u = root;
        while(u != null){
            stack.push(u);
            u = u.right;
        }
        int greater = 0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            greater += node.val;
            node.val = greater;
            node = node.left;
            while(node != null){
                stack.push(node);
                node = node.right;
            }
        }
        return root;
    }
}