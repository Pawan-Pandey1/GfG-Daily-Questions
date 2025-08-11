/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        if (head == null) return 0;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { 
                int count = 1;
                fast = fast.next;
                while (fast != slow) {
                    fast = fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
