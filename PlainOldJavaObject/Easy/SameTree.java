package PlainOldJavaObject;

/*
Same Tree problem
Given the roots of two binary trees, determine if they are structurally identical and their nodes have the same values.
Difficulty: Easy
Time Complexity O(n)
Space Complexity O(n)
*/

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean same = true;
        if (p == null && q == null) {
            return true;
        } else if (p == null ^ q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        if (p.left != null && q.left != null) {
            same = isSameTree(p.left, q.left);
        } else if (p.left != null ^ q.left != null) {
            same = false;
        }
        if (!same) {
            return false;
        }
        if (p.right != null && q.right != null) {
            same = isSameTree(p.right, q.right);
        } else if (p.right != null ^ q.right != null) {
            same = false;
        }
        return same;
    }
}
