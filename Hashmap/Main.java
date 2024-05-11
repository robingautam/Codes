package Hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*CustomHashMap<String,String> map = new CustomHashMap<>();
        map.put("Rajasthan","Jaipur");
        map.put("MP","Bhopal");
        map.put("UP","Lucknow");

        System.out.println(map.get("Rajasthan"));
        System.out.println(map.containsKey("JP"));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        map.remove("UP");
        map.remove("MP");
        //map.remove("Rajasthan");
        System.out.println(map.isEmpty());*/

        Student obj1 = new Student(1,"Robin","robin@gmail.com");
        Student obj2 = new Student(1,"Sharun","robin@gmail.com");
        System.out.println(obj1.equals(obj2));
        HashMap<Student,Integer> map = new HashMap<>();
        map.put(obj1,1);
        map.put(obj2,2);
        System.out.println(map);
        System.out.println(hash("abcsdfg"));
        System.out.println(hash("123456"));

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}