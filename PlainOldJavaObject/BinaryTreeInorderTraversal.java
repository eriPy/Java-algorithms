package PlainOldJavaObject;

import java.util.ArrayList;
import java.util.List;

/* 
Binary Tree Inorder Traversal problem
Given the root of a binary tree, return the inorder traversal (left subtree, node, right subtree) of its nodes' values.
Difficulty: Easy
Time Complexity O(n^2)
Space Complexity O(n)
*/

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> sortedList = new ArrayList<>();
        if (root == null) {
            return sortedList;
        }
        if (root.left != null) {
            sortedList.addAll(inorderTraversal(root.left));
        }
        sortedList.add(root.val);
        if (root.right != null) {
            sortedList.addAll(inorderTraversal(root.right));
        }
       return sortedList;
    }
}