/* Structure of a Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    boolean isFoldable(Node root) {
        // code here
        if(root==null){
            return true;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            Node left=queue.poll();
            Node right=queue.poll();
            if(left==null&&right==null){
                continue;
            }
            if(left==null||right==null){
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }
}