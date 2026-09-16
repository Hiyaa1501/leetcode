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

        List<String> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        findPath(root, "", result);   //current node,path,ans

        return result;
    }

    void findPath(TreeNode root, String path, List<String> result) {
        path = path + root.val;  //"" + 1

        if(root.left == null && root.right == null) {
            result.add(path);   //if leaf
            return;   //we stop going to the branch
        }

        if(root.left != null) {
            findPath(root.left, path + "->", result);
        }

        if(root.right != null) {
            findPath(root.right, path + "->", result);
        }
    }
}