package lamda;

import java.util.function.IntPredicate;

public class program5 {

	public static void main(String[] args) {

		IntPredicate lessThan18 = i->i<18;
		IntPredicate MoreThan10 = i->i>10;
		
		System.out.println(lessThan18.or(MoreThan10).test(45));

	}

}
