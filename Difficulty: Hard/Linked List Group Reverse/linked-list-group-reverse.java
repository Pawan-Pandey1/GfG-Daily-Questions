/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

/*
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head) {
        Node curr = head;
        Node prevNode = null;
        Node nextNode = null;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        return prevNode;
    }

    public Node getKthNode(Node temp, int k) {
        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevLast = null;

        while (temp != null) {
            Node kthNode = getKthNode(temp, k);

            // if less than k nodes remain, still reverse them
            if (kthNode == null) {
                kthNode = getLastNode(temp);
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;

            // reverse current group
            reverse(temp);

            if (head == temp) {
                head = kthNode;
            } else {
                prevLast.next = kthNode;
            }

            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }

    private Node getLastNode(Node node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
}
