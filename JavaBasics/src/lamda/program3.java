package lamda;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;
class Data {
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class program3 {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Chaand"));
		list.add(new Data("Ed"));
		list.add(new Data("Angelica"));
		list.add(new Data("Maqbul"));
		list.add(new Data("John"));

		Collections.sort(list, (Data o1, Data o2) -> {

			if(o1.getName().length() < o2.getName().length()){
				return -1;
			}else if(o1.getName().length() > o2.getName().length()){
				return 1;
			}else{
				return 0;
			}

		});

		for (Data data : list) {
			System.out.println(data.getName());
		}

	}
}