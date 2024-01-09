package lamda;

import java.util.ArrayList;
import java.util.List;

public class program4 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		
		fruits.forEach(i -> System.out.println(i));
		
	}

}
