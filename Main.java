public class Main {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(5);

        System.out.println("Adding elements");

        cache.put(2, 150);
        cache.display();

        cache.put(15, 600);
        cache.display();

        cache.put(11, 250);
        cache.display();

        cache.put(7, 400);
        cache.display();

        cache.put(13, 120);
        cache.display();

        System.out.println("Get key");

        System.out.println("Value of key 2: " + cache.get(2));
        cache.display();

        System.out.println("Make cache overloaded");

        cache.put(12, 51);
        cache.display();

        System.out.println("Put existing key");

        cache.put(13, 999);
        cache.display();

        System.out.println("Is cache empty: " + cache.isEmpty());

        System.out.println("Cache size: " + cache.getSize());

        System.out.println("Remove existing key");

        cache.remove(11);
        cache.display();

        System.out.println("Remove non-existing key");

        cache.remove(72);
        cache.display();

        System.out.println("Check eviction correctness");

        System.out.println("Value of key 15: " + cache.get(15));

        cache.display();


        System.out.println("Repeated access test");

        cache.get(2);
        cache.get(2);
        cache.get(2);

        cache.display();

        System.out.println("Empty cache test");

        LRUCache emptyCache = new LRUCache(3);

        System.out.println("Get from empty cache: " + emptyCache.get(100));

        emptyCache.remove(100);

        emptyCache.display();
    }
}