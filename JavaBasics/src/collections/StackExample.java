package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack);

        // pop
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // peek
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // isEmpty
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // size
        System.out.println("Stack Size: " + stack.size());

        // search
        int searchResult = stack.search(10);
        System.out.println("Search Result: " + searchResult);
        
        System.out.println("element in Index 0 Is :"+stack.get(0));
        

    }
}

