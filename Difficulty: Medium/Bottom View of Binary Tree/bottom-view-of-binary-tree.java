/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/



//User function Template for Java


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Pair>q=new LinkedList<>();
        Map<Integer,Integer>map=new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur=q.remove();
            int hd=cur.hd;
            Node temp=cur.node;
            map.put(hd,temp.data);
            
            if(temp.left!=null){
                q.add(new Pair(hd-1,temp.left));
            }
           if(temp.right!=null){
               q.add(new Pair(hd+1,temp.right));
           } 
           }
           for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public class Pair{
        int hd;
        Node node;
        
        public Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
}