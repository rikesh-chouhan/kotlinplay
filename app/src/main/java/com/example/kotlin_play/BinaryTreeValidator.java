package com.example.kotlin_play;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeValidator {

    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        return isValidLeftTree(root.val, root.left) && isValidRightTree(root.val, root.right);
    }

    boolean isValidLeftTree(int prevNodeValue, TreeNode left) {
        if (left == null) {
            return true;
        } else {

            if (prevNodeValue <= left.val) {
                return false;
            } else {
                return isValidLeftTree(left.val, left.left) && isValidRightTree(left.val, left.right);
            }

        }
    }

    boolean isValidRightTree(int prevNodeValue, TreeNode right) {

        if (right == null) {
            return true;
        } else {

            if (prevNodeValue >= right.val) {
                return false;
            } else {
                return isValidLeftTree(right.val, right.left) && isValidRightTree(right.val, right.right);
            }

        }

    }

}