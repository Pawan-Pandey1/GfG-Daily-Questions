/* Linklist node structure
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
    Node deleteNode(Node head, int x) {
        // code here
        if(x==1){
            head=head.next;
            return head;
        }
        
        int count=0;
        Node temp=head;
        Node prev=null;
        
        
        while(temp!=null){
            count++;
            
            if(count==x){
                prev.next=prev.next.next;
                break;
            }
            
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}