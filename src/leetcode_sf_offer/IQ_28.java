package leetcode_sf_offer;

/**
 * 剑指 Offer 28. 对称的二叉树
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 15:54
 */
public class IQ_28 {
    public boolean isSymmetric(TreeNode root) {

        if (root==null) return true;

        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode left,TreeNode right){

        if (left==null && right==null) return true;
        if (left==null || right==null) return false;

        return left.val==right.val && helper(left.left,right.right) && helper(left.right,right.left);
    }
}
