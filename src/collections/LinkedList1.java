package collections;

import java.util.LinkedList;

public class LinkedList1 {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<Integer> myList = new LinkedList<Integer>();

        // Append nodes to the list
        
       
        myList.add(30);
        myList.add(70);
        myList.add(40);
        myList.add(10);
        myList.add(60);
        myList.add(20);
        myList.add(80);
        myList.add(90);
        myList.add(50);
        
        System.out.println(myList);
        boolean res = myList.contains(10);
        System.out.println(res);
        
        myList.sort(null);
        
        System.out.println(myList);
        
       

    
    }
}

