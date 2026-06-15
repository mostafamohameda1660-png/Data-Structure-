public class LRUCache {

    private int capacity;
    private int size;

    private LinkedList list;
    private HashTable table;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        list = new LinkedList();
        table = new HashTable(capacity);
    }

    public int get(int key) {

        Node node = table.search(key);

        if (node == null) {
            return -1;
        }

        list.moveToFront(node);

        return node.value;
    }

    public void put(int key, int value) {

        Node existingNode = table.search(key);

        
        if (existingNode != null) {

            existingNode.value = value;

            list.moveToFront(existingNode);

            return;
        }

        if (size >= capacity) {

            Node removedNode = list.removeTail();

            if (removedNode != null) {
                table.remove(removedNode.key);
                size--;
            }
        }
        
        Node newNode = new Node(key, value);

        list.insert_at_front(newNode);

        table.insert(key, newNode);

        size++;
    }

    public void remove(int key) {

        Node node = table.search(key);

        if (node == null) {
            return;
        }

        list.removeNode(node);

        table.remove(key);

        size--;
    }

    public void display() {

        System.out.print("Cache State (MRU -> LRU): ");

        list.display();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}