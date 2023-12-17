package collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Apple"); // Duplicate, won't be added

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element is present
        System.out.println("Contains 'Banana': " + treeSet.contains("Banana"));

        // Removing an element
        treeSet.remove("Orange");

        // Displaying the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        // Iterating over the elements
        System.out.println("Iterating over the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clear: " + treeSet);

        // Additional methods:

        // isEmpty() - Check if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // size() - Get the number of elements in the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());
    }
}
