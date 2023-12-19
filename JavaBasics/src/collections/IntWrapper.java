package collections;
// this is custom wrapper class.

public class IntWrapper {
    private int value;

    // Constructor
    public IntWrapper(int value) {
        this.value = value;
    }

    // Getter
    public int getValue() {
        return value;
    }

    // Setter
    public void setValue(int value) {
        this.value = value;
    }

    // Additional method
    public void increment() {
        value++;
    }

    // Additional method
    public void decrement() {
        value--;
    }

    // Example of overriding toString() method
    @Override
    public String toString() {
        return "IntWrapper{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        // Creating an instance of the custom wrapper class
        IntWrapper myIntWrapper = new IntWrapper(10);

        // Using getter and setter
        System.out.println("Original Value: " + myIntWrapper.getValue());
        myIntWrapper.setValue(20);
        System.out.println("Updated Value: " + myIntWrapper.getValue());

        // Using additional methods
        myIntWrapper.increment();
        System.out.println("After Increment: " + myIntWrapper.getValue());

        myIntWrapper.decrement();
        System.out.println("After Decrement: " + myIntWrapper.getValue());

        // Using toString() method
        System.out.println(myIntWrapper);  // Calls the overridden toString() method
    }
}


