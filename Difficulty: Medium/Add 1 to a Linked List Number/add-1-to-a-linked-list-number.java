

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node Next=null;
        
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        
        head=reverse(head);
        Node temp=head;
        int carry=1;
        
        while(temp!=null){
            temp.data+=carry;
            
            if(temp.data<10){
                carry=0;
                break;
            }else{
                temp.data=0;
            }
            if(temp.next==null && carry>0){
                Node newNode=new Node(1);
                temp.next=newNode;
                carry=0;
            }
            temp=temp.next;
        }
        head=reverse(head);
        return head;
    }
}
