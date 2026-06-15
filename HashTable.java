public class HashTable {
    private class HashEntry {
        int key;
        Node nodeRef;
        HashEntry next;

        public HashEntry(int key, Node nodeRef) {
            this.key = key;
            this.nodeRef = nodeRef;
        }
    }

    private HashEntry[] buckets;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.buckets = new HashEntry[capacity * 2];
    }

    private int getIndex(int key) {
        return Math.abs(key) % buckets.length;
    }

    public void insert(int key, Node nodeRef) {
        int index = getIndex(key);
        HashEntry current = buckets[index];
        while (current != null) {
            if (current.key == key) {
                current.nodeRef = nodeRef;
                return;
            }
            current = current.next;
        }
        HashEntry newEntry = new HashEntry(key, nodeRef);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
    }

    public Node search(int key) {
        int index = getIndex(key);
        HashEntry current = buckets[index];
        while (current != null) {
            if (current.key == key) return current.nodeRef;
            current = current.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = getIndex(key);
        HashEntry current = buckets[index];
        HashEntry prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev != null) prev.next = current.next;
                else buckets[index] = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
    
