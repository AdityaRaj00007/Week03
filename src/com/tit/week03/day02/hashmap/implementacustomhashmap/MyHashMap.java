package com.tit.week03.day02.hashmap.implementacustomhashmap;
public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16; // Default size of the array
    private Node<K, V>[] buckets; // Array of linked lists
    private int size; // Number of key-value pairs in the hash map

    // Node class to represent key-value pairs in the linked list
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // Constructor
    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    // Hash function to map a key to an index in the array
    private int getBucketIndex(K key) {
        if (key == null) {
            return 0; // Place null keys in the first bucket
        }
        return Math.abs(key.hashCode()) % buckets.length;
    }

    // Insert or update a key-value pair
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];

        // Check if the key already exists in the linked list
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; // Update the value
                return;
            }
            head = head.next;
        }

        // Insert the new key-value pair at the beginning of the linked list
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[bucketIndex];
        buckets[bucketIndex] = newNode;
        size++;
    }

    // Retrieve the value associated with a key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];

        // Search for the key in the linked list
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null; // Key not found
    }

    // Remove a key-value pair
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];
        Node<K, V> prev = null;

        // Search for the key in the linked list
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[bucketIndex] = head.next; // Remove the first node
                } else {
                    prev.next = head.next; // Remove a node in the middle or end
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Get the number of key-value pairs in the hash map
    public int size() {
        return size;
    }

    // Test the implementation
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        System.out.println("Value for 'apple': " + map.get("apple"));
        System.out.println("Value for 'banana': " + map.get("banana"));

        map.remove("banana");
        System.out.println("Value for 'banana' after removal: " + map.get("banana"));

        System.out.println("Size of the hash map: " + map.size());
    }
}