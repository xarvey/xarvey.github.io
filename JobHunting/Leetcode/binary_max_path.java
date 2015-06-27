/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class Solution {
    int maxSolution=-999999;
   
    public int maxPathSum(TreeNode root) {
        int maxTempPath=-9999999;
        if (root==null) return 0;
        maxTempPath=Math.max(maxTempPath,root.val);
        int left=maxPathSum(root.left)+root.val;
        int right=maxPathSum(root.right)+root.val;
        maxTempPath=Math.max(maxTempPath,left);
        maxTempPath=Math.max(maxTempPath,right);
        maxTempPath=Math.max(maxTempPath,left+right-root.val);
        maxSolution=Math.max(maxSolution,maxTempPath);
        return maxTempPath;
    }
}