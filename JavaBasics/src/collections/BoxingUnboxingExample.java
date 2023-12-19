package collections;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // Boxing: Converting primitive types to wrapper classes
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        double primitiveDouble = 3.14;
        Double wrappedDouble = Double.valueOf(primitiveDouble);

        // Autoboxing: Automatic conversion from primitive types to wrapper classes
        char primitiveChar = 'A';
        Character wrappedChar = primitiveChar;

        // Unboxing: Converting wrapper classes to primitive types
        int anotherInt = wrappedInt.intValue();
        double anotherDouble = wrappedDouble.doubleValue();

        // Auto-unboxing: Automatic conversion from wrapper classes to primitive types
        char anotherChar = wrappedChar;

        // Displaying the values
        System.out.println("Primitive Int: " + primitiveInt);
        System.out.println("Wrapped Int: " + wrappedInt);
        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Primitive Char: " + primitiveChar);
        System.out.println("Wrapped Char: " + wrappedChar);
        System.out.println("Another Int: " + anotherInt);
        System.out.println("Another Double: " + anotherDouble);
        System.out.println("Another Char: " + anotherChar);
    }
}

