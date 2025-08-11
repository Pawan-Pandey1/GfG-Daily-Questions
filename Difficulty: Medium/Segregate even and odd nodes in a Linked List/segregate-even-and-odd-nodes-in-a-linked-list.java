// User function Template for Java

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
    Node divide(Node head) {
        // code here
        Node evenStart=null;
        Node evenEnd=null;
        
        Node oddStart=null;
        Node oddEnd=null;
        
        Node curr=head;
        
        while(curr!=null){
            if(curr.data%2==0){
                if(evenStart==null){
                    evenStart=curr;
                    evenEnd=evenStart;
                }else{
                    evenEnd.next=curr;
                    evenEnd=evenEnd.next;
                }
            }else{
                if(oddStart==null){
                    oddStart=curr;
                    oddEnd=oddStart;
                }else{
                    oddEnd.next=curr;
                    oddEnd=oddEnd.next;
                }
            }
            curr=curr.next;
        }
        if(evenStart==null){
            return oddStart;
        }
        
        evenEnd.next=oddStart;
        
        if(oddEnd!=null){
            oddEnd.next=null;
        }
        return evenStart;
    }
}