/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public boolean isSymmetric(Node root) {
        // Code here
        if(root==null){
            return true;
        }
        
        return checkSymmertric(root.left,root.right);
    }
    
    boolean checkSymmertric(Node left,Node right){
        if(left==null || right==null){
            return left==right; 
        }
        
        if(left.data!=right.data) return false;
        
        return checkSymmertric(left.left,right.right) && checkSymmertric(left.right,right.left);
        
    }
}