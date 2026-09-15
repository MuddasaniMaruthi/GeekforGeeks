/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;

  public Node(int val) {
      data = val;
      left = right = null;
  }
};*/

class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>tree1=new ArrayList<>();
        ArrayList<Integer>tree2=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        inorder(r1,tree1);
        inorder(r2,tree2);
        for(int i=0;i<tree1.size();i++){
           set.add(tree1.get(i)); 
            
        }
        for(int i=0;i<tree2.size();i++){
            if(set.contains(tree2.get(i))){
                list.add(tree2.get(i));
            }
        }
        Collections.sort(list);
        return list;
    }
    static void inorder(Node root,ArrayList<Integer>tree1){
        if(root==null){
            return ;
        }
        inorder(root.left,tree1);
        tree1.add(root.data);
        inorder(root.right,tree1);
        
    }
    static void inorder1(Node root,ArrayList<Integer>tree2){
        if(root==null){
            return ;
        }
        inorder1(root.left,tree2);
        tree2.add(root.data);
        inorder1(root.right,tree2);
    }
}