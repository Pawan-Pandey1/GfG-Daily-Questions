// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

//Recursive Code
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(head==null){
            return false;
        }
        
        if(head.data==key){
            return true;
        }
        
        return searchKey(n,head.next,key);
    }
}