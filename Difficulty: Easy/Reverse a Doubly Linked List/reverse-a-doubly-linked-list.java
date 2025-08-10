/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head==null || head.next==null){
            return head;
        }
        
        DLLNode previous=null;
        DLLNode curr=head;
        
        while(curr!=null){
            previous=curr.prev;
            
            curr.prev=curr.next;
            
            curr.next=previous;
            
            curr=curr.prev;
        }
        return previous.prev;
    }
}