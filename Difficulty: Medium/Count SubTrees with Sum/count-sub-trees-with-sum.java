/* Structure of tree node
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Solution {
    int c=0;
    int countSubtrees(Node root, int x) {
        //  code here.
        if(root==null){
            return 0;
        }
        count(root,x);
        return c;
    }
    int count(Node root,int x){
        if(root==null){
            return 0;
        }
        int left=count(root.left,x);
        int right=count(root.right,x);
        if(left+right+root.data==x){
            c++;
        }
        return left+right+root.data;
    }
}