package LLDMachineCoding;


import java.util.HashMap;

public class LRUCache {

private class Node {

int key;
int value;
Node prev;
Node next;

Node (int key, int value) {
    this.key = key;
    this.value = value;
}
}

private final int capacity;
private final HashMap<Integer, Node> cache;
private final Node head;
private final Node tail;

    public LRUCache(int capacity, HashMap<Integer, Node> cache, Node head, Node tail) {
        this.capacity = capacity;
        this.cache = cache;
        this.head = head;
        this.tail = tail;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        // Initialize dummy head and tail nodes
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }


    // making two  get and put methods for LRU cache

    // first we will implement get method which will return the value of the key if it exists in the cache and also move the node to the head of the linked list to mark it as most recently used
    public int get (int key)
    {

      if(!cache.containsKey(key)){
            return -1; // key not found
      }

        // if key is found, move the node to the head of the linked list
        // getting the node from the cache
        Node node = cache.get(key);
        moveToFront(node);
         // moveToHead method will remove the node from its current position and add it to the head of the linked list
         return node.value;

    }

    private void moveToFront(Node node) {
    }


    public void put(int key, int value) {

        if (cache.containsKey(key)) {
            Node existingNode = cache.get(key);
            existingNode.value = value;
            moveToFront(existingNode);
            return;
        }

        if (cache.size() == capacity) {
            Node lru = removeLRU();
            cache.remove(lru.key);
        }

        Node newNode = new Node(key, value);
        addToFront(newNode);
        cache.put(key, newNode);
    }



    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private Node removeLRU() {
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }



}
