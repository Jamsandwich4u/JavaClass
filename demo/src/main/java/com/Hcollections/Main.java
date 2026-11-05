package com.Hcollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // collections and generics:
        // external data - read line by line -> filter/extract -> internal structure
        // entity based design .

        // list - items in a sequence access by position.  Arraylist.
        // set - distinct items.
        // map - I want fast lookup with a key.  hashmap.
        // queue - FIFO dequeue

        // array drawbacks - fixed size + no methods.

        // Collections is a framework.
        // characteristics:
            // generics.
            // dynamic sizing.
            // flexibility.

        /*
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("one, two, three");  // allowed but unsafe.
        */
        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add(10);  // not allowed.
        */
        /*
        List<String> food = new ArrayList<>();

        food.add("apple");
        food.add("bread");
        food.add("avocado");

        System.out.println(food);
        System.out.println(food.get(0));
        System.out.println(food.remove(1));
        food.set(0, "orange");

        System.out.println(food.size());
        System.out.println(food);

        Collections.sort(food);
        System.out.println("sorted " + food);
        */

        // dequeue:
        /*        
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);

        deque.offerFirst(3);
        deque.offerLast(4);  // use when capacity is limited.

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();  // returns null if empty.

        deque.peekFirst();  // looks at the first element without removing it.
                            // returns null if empty.

        deque.push(null);
        */

        // hashmap:

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);  // add or replace.

        System.out.println(map.get("banana"));  // 2

        map.put("apple", 4);  // replace value for key "apple".
        map.putIfAbsent("apple", 100);

        System.out.println(map.get("apple"));  // 4

        map.getOrDefault("grape", 0);  // returns 0 if key not found.

        System.out.println(map.keySet());  // returns a set of keys.
        System.out.println(map.values());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        





    }
}
