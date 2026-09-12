/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    static boolean isleaf(Node root){
        return root.left==null&&root.right==null;
    }
    static void leftboundary(Node root,ArrayList<Integer>res){
        Node curr=root.left;
        while(curr!=null){
            if(!isleaf(curr)){
                res.add(curr.data);
            }
            if(curr.left!=null){
            curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }
    static void rightboundary(Node root,ArrayList<Integer>res){
        Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr!=null){
            if(!isleaf(curr)){
                temp.add(curr.data);
            }
            if(curr.right!=null){
            curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
    static void addleaves(Node root,ArrayList<Integer>res){
        if(isleaf(root)){
            res.add(root.data);
            return ;
        }
        if(root.left!=null){
            addleaves(root.left,res);
        }
         if(root.right!=null){
            addleaves(root.right,res);
        }
    }
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        if(!isleaf(root)){
            res.add(root.data);
        }
        leftboundary(root,res);
        addleaves(root,res);
         rightboundary(root,res);
         return res;
    }
}