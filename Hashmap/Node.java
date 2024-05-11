package Hashmap;

public class Node<K,V> {
    K key;
    V value;
    Node(){

    }
    Node(K k, V v){
        this.key = k;
        this.value = v;
    }
}
