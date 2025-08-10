/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node addNode(Node head, int p, int x) {
        // code here
        int count=0;
        Node curr=head;
        
        Node newNode=new Node(x);
        
        if(head==null){
            return newNode;
        }
        
        
        while(count<p && curr!=null){
            curr=curr.next;
            count++;
        }
        
        if(curr==null){
            return head;
        }
        
        newNode.next=curr.next;
        newNode.prev=curr;
        curr.next=newNode;
        
        return head;
        
    }
}