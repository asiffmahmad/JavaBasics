package generics_a;

class Data1<K extends Integer, V> {  // Remove the bound for V
    private K key;
    private V value;

    public Data1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data [key=" + key + ", value=" + value + "]";
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <E extends Character, N extends Number> void display(E element, N number) {
        System.out.println("Element: " + element + " Number: " + number);
    }
}

public class TestGenerics4 {

    public static void main(String[] args) {
        // Now, you can instantiate Data1 with String as the value type
        Data1<Integer, String> data = new Data1<>(1, "value");
        data.display('$', 1);
    }
}
