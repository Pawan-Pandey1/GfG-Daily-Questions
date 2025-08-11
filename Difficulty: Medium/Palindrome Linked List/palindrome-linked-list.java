/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    private Node reverseLL(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        // Your code here
        if(head==null || head.next==null){
            return true;
        }
        
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node newHead=reverseLL(slow.next);
        Node oldHead=head;
            
            while(newHead!=null){
                if(newHead.data!=oldHead.data){
                    return false;
                }
                newHead=newHead.next;
                oldHead=oldHead.next;
        }
        return true;
    }
}