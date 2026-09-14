/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node>list=new ArrayList<>();
        Queue<Node>queue=new LinkedList<>();
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        queue.offer(root);
        while(!queue.isEmpty()){
            int ls=queue.size();
            for(int i=0;i<ls;i++){
                Node curr=queue.poll();
                if(curr.data<key){
                    min=Math.max(min,curr.data);
                }
                else if(curr.data>key){
                    max=Math.min(max,curr.data);
                }
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
        }
        /*if(min==Integer.MAX_VALUE){
            list.add(null);
        }
        if(max==Integer.MIN_VALUE){
            list.add(null);
        }
        */
        if(min==Integer.MIN_VALUE){
            list.add(null);
        }
        else{
        list.add(new Node(min));
        }
        if(max==Integer.MAX_VALUE){
            list.add(null);
        }
        else{
        list.add(new Node(max));
        }
        return list;
    }
}