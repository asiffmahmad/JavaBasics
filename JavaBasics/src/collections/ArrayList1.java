/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 */
public class ArrayList1 {

	public static void main(String[] args) {
		// Creating and initializing an ArrayList
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");

		// Displaying the original ArrayList
		System.out.println("Original ArrayList: " + fruits);

		// 1. addAll(Collection<? extends E> c)
		// Adds all elements from the specified collection to the end of the ArrayList.
		List<String> moreFruits = new ArrayList<>();
		moreFruits.add("Grapes");
		moreFruits.add("Pineapple");
		fruits.addAll(moreFruits);
		System.out.println("After adding more fruits: " + fruits);

		// 2. sort(Comparator<? super E> c)
		// Sorts the ArrayList in ascending order.
		Collections.sort(fruits);
		System.out.println("After sorting: " + fruits);

		// 3. removeIf(Predicate<? super E> filter)
		// Removes all elements from the ArrayList that satisfy the given predicate.
		fruits.removeIf(fruit -> fruit.length() > 6);
		System.out.println("After removing long-named fruits: " + fruits);

		// 4. replaceAll(UnaryOperator<E> operator)
		// Replaces all elements in the ArrayList with the result of applying the given
		// operator.
		fruits.replaceAll(String::toUpperCase);
		System.out.println("After converting to uppercase: " + fruits);

		// 5. removeAll(Collection<?> c)
		// Removes all elements from the ArrayList that are present in the specified
		// collection.
		fruits.removeAll(moreFruits);
		System.out.println("After removing more fruits: " + fruits);

		// 6. indexOf(Object o) and lastIndexOf(Object o)
		// Returns the index of the first and last occurrences of the specified element.
		fruits.add("Apple");
		System.out.println("Index of 'Apple': " + fruits.indexOf("Apple"));
		System.out.println("Last index of 'Apple': " + fruits.lastIndexOf("Apple"));

		// 7. subList(int fromIndex, int toIndex)
		// Returns a view of the portion of the ArrayList between the specified
		// fromIndex (inclusive) and toIndex (exclusive).
		List<String> subList = fruits.subList(1, 3);
		System.out.println("Sublist from index 1 to 3: " + subList);

		// 8. clear()
		// Removes all elements from the ArrayList.
		fruits.clear();
		System.out.println("After clearing the ArrayList: " + fruits);

		// Additional methods:

		// 9. isEmpty()
		// Returns true if the ArrayList contains no elements.
		System.out.println("Is the ArrayList empty? " + fruits.isEmpty());

		// 10. size()
		// Returns the number of elements in the ArrayList.
		System.out.println("Size of the ArrayList: " + fruits.size());

		// 11. contains(Object o)
		// Returns true if the ArrayList contains the specified element.
		System.out.println("Does the ArrayList contain 'Banana'? " + fruits.contains("Banana"));

		// 12. toArray()
		// Returns an array containing all elements of the ArrayList in proper sequence.
		String[] array = fruits.toArray(new String[0]);
		System.out.print("Array from ArrayList: ");
		for (String item : array) {
			System.out.print(item + " ");
		}
		System.out.println();

		// 13. iterator()
		// Returns an iterator over the elements in the ArrayList.
		Iterator<String> iterator = fruits.iterator();
		System.out.print("Using iterator: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// 14. listIterator()
		// Returns a list iterator over the elements in the ArrayList (in proper
		// sequence).
		if (!fruits.isEmpty()) {
			ListIterator<String> listIterator = fruits.listIterator();
			System.out.print("Using listIterator: ");
			while (listIterator.hasNext()) {
				System.out.print(listIterator.next() + " ");
			}
			System.out.println();
		} else {
			System.out.println("ArrayList is empty. Cannot use listIterator.");
		}

		// 15. listIterator(int index)
		// Returns a list iterator over the elements in the ArrayList, starting at the
		// specified index.
		if (!fruits.isEmpty()) {
			ListIterator<String> listIterator = fruits.listIterator(1);
			System.out.print("Using listIterator starting from index 1: ");
			while (listIterator.hasNext()) {
				System.out.print(listIterator.next() + " ");
			}
			System.out.println();
		} else {
			System.out.println("ArrayList is empty. Cannot use listIterator.");
		}
	}
}