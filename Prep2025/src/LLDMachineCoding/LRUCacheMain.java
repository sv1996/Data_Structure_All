package LLDMachineCoding;

public class LRUCacheMain {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 100);
        cache.put(2, 200);
        cache.put(3, 300);

        System.out.println("Get 1: " + cache.get(1)); // 100

        cache.put(4, 400); // Should evict key 2

        System.out.println("Get 2 (should be -1): " + cache.get(2));

        cache.put(5, 500); // Should evict key 3

        System.out.println("Get 3 (should be -1): " + cache.get(3));
        System.out.println("Get 4: " + cache.get(4));
        System.out.println("Get 5: " + cache.get(5));
    }
}
