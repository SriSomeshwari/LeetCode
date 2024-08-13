import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at current level
            List<Integer> levelValues = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                levelValues.add(currentNode.val);
                
                if (currentNode.left != null) { // Updated to left
                    queue.add(currentNode.left);
                }
                
                if (currentNode.right != null) { // Updated to right
                    queue.add(currentNode.right);
                }
            }
            
            result.add(levelValues);
        }
        
        return result;
    }
}
