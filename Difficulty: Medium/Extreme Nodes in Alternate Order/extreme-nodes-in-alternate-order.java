/* Structure of a binary tree Node
class Node{
    int data;
    Node left, right;
    Node(int d)
    {
      data = d;
      left = null;
      right = null;
    }
}*/
class Solution {
    public ArrayList<Integer> extremeNodes(Node root) {
        // code here
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        boolean flag=true;
        while(!queue.isEmpty()){
            int ls=queue.size();
            for(int i=0;i<ls;i++){
                Node curr = queue.poll();
                if(flag){
                    if(i==ls-1){
                        list.add(curr.data);
                    }
                }
                if(!flag){
                    if(i==0){
                        list.add(curr.data);
                    }
                }
                if(curr.left!=null){
                    queue.offer(curr.left);
                    
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            flag=!flag;
        }
        return list;
    }
}