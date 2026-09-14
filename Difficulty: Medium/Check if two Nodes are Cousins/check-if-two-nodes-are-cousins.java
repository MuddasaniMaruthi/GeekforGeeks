/* Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};*/
class Solution {
    public boolean areCousins(Node root, int a, int b) {
        // code here
        if(root==null){
            return false;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        int pa=-1;
        int pb=-1;
        int lv=1;
        int la=0;
        int lb=0;
        while(!queue.isEmpty()){
            int ls=queue.size();
            for(int i=0;i<ls;i++){
                Node curr=queue.poll();
                if(curr.left!=null){
                    queue.offer(curr.left);
                    if(curr.left.data==a){
                        pa=curr.data;
                        la=lv;
                    }
                    if(curr.left.data==b){
                        pb=curr.data;
                        lb=lv;
                    }
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                    if(curr.right.data==a){
                        pa=curr.data;
                        la=lv;
                    }
                    if(curr.right.data==b){
                        pb=curr.data;
                        lb=lv;
                    }
                }
            }
            if(pa!=-1&&pb!=-1&&la==lb&&pa!=pb){
                return true;
            }
            lv++;
        }
        return false;
    }
}