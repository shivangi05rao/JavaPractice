package collectionframework.hashmap;


import java.util.LinkedList;

public class HashMapImplementation {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private void initBuckets(int N){ //N - capacity/ size of buckets array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        public MyHashMap() {

        }

        private int n; //Track of entries in map

        private LinkedList<Node>[] buckets;

        public int size() { //return the number of entries in map
            return n;
        }

        public void put(K key, V value) { //insert and update

        }

//        public V get(K key) {
//
//        }
//
//        public V remove(K key) {
//
//        }

    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map1 = new MyHashMap<>();

    }
}
