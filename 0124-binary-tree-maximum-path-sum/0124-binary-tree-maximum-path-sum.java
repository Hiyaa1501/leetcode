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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

    int maxPath(TreeNode node) {
        if(node == null) {
            return 0;
        }
        //If the child's contribution is negative-> ignore it
        int left = Math.max(0, maxPath(node.left));
        int right = Math.max(0, maxPath(node.right));

        int currentPath = left + node.val + right;  //15+20+7

        maxSum = Math.max(maxSum, currentPath);  //update the max value

        return node.val + Math.max(left, right); //20 + max(15, 7)
    }
}