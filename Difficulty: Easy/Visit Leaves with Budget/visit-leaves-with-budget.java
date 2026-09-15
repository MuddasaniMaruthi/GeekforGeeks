/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public int getCount(Node root, int k) {
        // code here
        Queue<Node>queue=new LinkedList<>();
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            return 0;
        }
        int lv=1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int ls=queue.size();
            for(int i=0;i<ls;i++){
                Node curr=queue.poll();
                if(curr.left==null&&curr.right==null){
                    list.add(lv);
                }
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
        }
        lv++;
        }
        Collections.sort(list);
        int sum=0;
        int c=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
            if(sum<=k){
                c++;
            }
            else{
            break;
            }
        }
        return c;
    }
}