/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean dfs(Node root, int min, int max ){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.data-min==1 && max-root.data==1){
                return true;
            }
        }
        
        return dfs(root.left,min,root.data)||dfs(root.right,root.data,max);
    }
    public boolean isDeadEnd(Node root) {
        // Code here.
        return dfs(root,0,Integer.MAX_VALUE);
        
    }
}