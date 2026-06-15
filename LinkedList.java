public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insert_at_front(Node node) {

        node.prev = null;
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    
    public void removeNode(Node node) {

        if (node == null)
            return;

        if (node == head) {
            head = head.next;

            if (head != null)
                head.prev = null;
            else
                tail = null;
        }

        else if (node == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        
        else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        node.next = null;
        node.prev = null;
    }
    
    public void moveToFront(Node node) {

        if (node == null || node == head)
            return;

        removeNode(node);
        insert_at_front(node);
    }
    
    public Node removeTail() {

        if (tail == null)
            return null;

        Node removedNode = tail;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        removedNode.prev = null;
        removedNode.next = null;

        return removedNode;
    }
    
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print("(" + current.key + "," + current.value + ") ");
            current = current.next;
        }

        System.out.println();
    }
}