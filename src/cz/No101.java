package cz;

import tree.TreeNode;

public class No101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val) {
            return false;
        } else {
            return isSymmetric(left.left, right.right) &&
                    isSymmetric(left.right, right.left);
        }
    }
}