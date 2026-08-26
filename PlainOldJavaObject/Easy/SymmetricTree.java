package PlainOldJavaObject;

/*
Symmetric Tree problem
Given the root of a binary tree, check whether it is symmetric around its center (a mirror of itself).
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(n)
*/

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode rootLeft = root.left;
        TreeNode rootRight = root.right;
        if (rootLeft == null && rootRight == null) {
            return true;
        } else if (rootLeft == null ^ rootRight == null) {
            return false;
        }
        return vefify(rootLeft, rootRight); 
    }
    public boolean vefify(TreeNode rootLeft, TreeNode rootRight) {
        if (rootLeft.val != rootRight.val) {
            return false;
        }
        boolean res = true;
        if (rootLeft.left != null && rootRight.right != null) {
            res = vefify(rootLeft.left, rootRight.right);
        } else if (rootLeft.left != null ^ rootRight.right != null) {
            return false;
        }
        if (!res) {
            return false;
        }
        if (rootLeft.right != null && rootRight.left != null) {
            res = vefify(rootLeft.right, rootRight.left);
        } else if (rootLeft.right != null ^ rootRight.left != null) {
            return false;
        }
        return res;
    }   
}
