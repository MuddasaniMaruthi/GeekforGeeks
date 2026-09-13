/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Pair{
        Node node;
        int hd;
    
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<Pair>queue=new LinkedList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair p =queue.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(!map.containsKey(hd)){
                map.put(hd,curr.data);
            }
            if(curr.left!=null){
                queue.offer(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null){
                 queue.offer(new Pair(curr.right,hd+1));
            }
        }
    
        for(int values:map.values()){
            list.add(values);
        }
        return list;
        
    }
}