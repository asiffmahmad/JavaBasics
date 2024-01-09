package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C++", 3);

        // Accessing values
        System.out.println("Java's popularity: " + hashMap.get("Java"));

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Additional Methods
        // compute: Apply a function to the specified key and its current mapped value
        hashMap.compute("Java", (key, value) -> value + 1);
        System.out.println("Java's updated popularity: " + hashMap.get("Java"));

        // computeIfAbsent: If the specified key is not already associated with a value, compute its value
        hashMap.computeIfAbsent("JavaScript", key -> 4);
        System.out.println("JavaScript's popularity: " + hashMap.get("JavaScript"));

        // computeIfPresent: If the specified key is already associated with a value, compute a new value
        hashMap.computeIfPresent("Python", (key, value) -> value * 2);
        System.out.println("Python's updated popularity: " + hashMap.get("Python"));

        // merge: Merge the specified key and its current mapped value with the given value
        hashMap.merge("C++", 10, Integer::sum);
        System.out.println("C++'s updated popularity: " + hashMap.get("C++"));

        // replaceAll: Replace each value with the result of applying a function to its key and current mapped value
        hashMap.replaceAll((key, value) -> value * 2);
        System.out.println("All updated values: " + hashMap);
    }
}
