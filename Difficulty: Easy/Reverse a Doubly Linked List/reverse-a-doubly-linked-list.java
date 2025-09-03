/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        
        Node previous=null;
        Node curr=head;
        
        while(curr!=null){
            previous=curr.prev;
            
            curr.prev=curr.next;
            
            curr.next=previous;
            
            curr=curr.prev;
        }
        return previous.prev;
    }
}