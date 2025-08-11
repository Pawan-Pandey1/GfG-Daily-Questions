/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    int getKthFromLast(Node head, int k) {
        if (head == null) return -1;

        Node fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1; 
            fast = fast.next;
        }

        Node slow = head;
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}
