/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head==null){
            return null;
        }
        
        if(x==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }
        
        int count=1;
        Node previous=null;
        Node curr=head;
        
        while(curr!=null && count<x){
            previous=curr;
            curr=curr.next;
            count++;
        }
        
        if(curr!=null){
            previous.next=curr.next;
            
            if(curr.next!=null){
                curr.next.prev=previous;
            }
        }
        return head;
    }
}