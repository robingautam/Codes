package Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashMap<K,V>{

    LinkedList<Node> bucket[] = new LinkedList[16];
    int N;
    int size;
    public double load_factor = 0.75;

    CustomHashMap(){
        this.N = 16;
        for (int i=0;i<bucket.length;i++){
            bucket[i] = new LinkedList<>();
        }
    }

    public int hashFunction(K key){
        int code = key.hashCode();
        int index = code%bucket.length;
        return index;
    }

    public int checkIfPresent(int index, K key){
        LinkedList<Node> list = bucket[index];
        for (int i=0;i<list.size();i++){
            Node node = list.get(i);
            if (node.key==key){
                return i;
            }
        }
        return -1;
    }

    public void put(K key, V value){
      int index = hashFunction(key);
      int di = checkIfPresent(index,key);

      if (di==-1){ // key not found
          bucket[index].add(new Node(key,value));
          this.size++;
      }else { // key found
          Node node = bucket[index].get(di);
          node.value = value;
      }
      double lambda = this.size/this.N;
      if (lambda>load_factor){
          rehashing();
      }
    }

    public void rehashing(){
        LinkedList<Node> oldBucket[] = bucket;
        bucket = new LinkedList[N*2];

        for (int i=0;i<N*2;i++){
            bucket[i] = new LinkedList<>();
        }

        for (int i=0;i<oldBucket.length;i++){
            LinkedList<Node> list = oldBucket[i];
            for (int j=0;j<list.size();j++){
                Node node = list.get(j);
                put((K) node.key, (V) node.value);
            }
        }
    }

    public V get(K key){
        int index = hashFunction(key);
        int di = checkIfPresent(index,key);

        if (di!=-1){
            Node node = bucket[index].get(di);
            return (V) node.value;
        }

        throw new NullPointerException();
    }

    public boolean containsKey(K key){
        int index = hashFunction(key);
        int di = checkIfPresent(index,key);
        if (di!=-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
       return this.size==0;
    }

    public ArrayList<K> keySet(){
        ArrayList<K> ans = new ArrayList<>();
        for (int i=0;i<bucket.length;i++){
            LinkedList<Node> list = bucket[i];
            for (int j=0;j<list.size();j++){
                Node node = list.get(j);
                ans.add((K) node.key);
            }
        }
        return ans;
    }

    public boolean remove(K key){
        int index = hashFunction(key);
        int di = checkIfPresent(index,key);

        if (di!=-1){
            LinkedList<Node> list = bucket[index];
            list.remove(di);
            this.size--;
            return true;
        }
        return false;
    }

}
