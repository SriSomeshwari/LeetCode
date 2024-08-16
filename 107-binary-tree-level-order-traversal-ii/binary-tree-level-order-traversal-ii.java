import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                level.add(temp.val);
                
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            res.add(0, level); 
        }
        
        return res;
    }
}
