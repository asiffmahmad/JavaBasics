package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List (ArrayList implementation)
        List<String> myList = new ArrayList<>();

        // Adding elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Accessing elements
        System.out.println("Element at index 1: " + myList.get(1));

        // Iterating through the list
        System.out.print("Elements in the list: ");
        for (String fruit : myList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Removing an element
        myList.remove("Banana");

        // Displaying the modified list
        System.out.print("Updated list: ");
        for (String fruit : myList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Finding the index of an element
        int indexOfOrange = myList.indexOf("Orange");
        System.out.println("Index of 'Orange': " + indexOfOrange);

        // Finding the last index of an element
        myList.add("Apple"); // Adding a duplicate element
        int lastIndexOfApple = myList.lastIndexOf("Apple");
        System.out.println("Last Index of 'Apple': " + lastIndexOfApple);

        // Creating a sublist
        List<String> sublist = myList.subList(0, 2);
        System.out.print("Sublist: ");
        for (String fruit : sublist) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Using a ListIterator to traverse the list in reverse
        ListIterator<String> listIterator = myList.listIterator(myList.size());
        System.out.print("Reversed list: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}

