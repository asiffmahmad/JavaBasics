package collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate, won't be added

        // Displaying the HashSet
        System.out.println("HashSet: " + hashSet);

        // Checking if an element is present
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        // Removing an element
        hashSet.remove("Orange");

        // Displaying the HashSet after removal
        System.out.println("HashSet after removal: " + hashSet);

        // Iterating over the elements
        System.out.println("Iterating over the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clear: " + hashSet);

        // Additional methods:

        // isEmpty() - Check if the HashSet is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // size() - Get the number of elements in the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // addAll() - Add all elements from another collection
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Grapes");
        anotherSet.add("Mango");
        hashSet.addAll(anotherSet);
        System.out.println("HashSet after adding another set: " + hashSet);

        // retainAll() - Retain only the elements present in both sets
        hashSet.retainAll(anotherSet);
        System.out.println("HashSet after retaining common elements: " + hashSet);

        // removeAll() - Remove all elements present in another set
        hashSet.removeAll(anotherSet);
        System.out.println("HashSet after removing elements from another set: " + hashSet);
    }
}

