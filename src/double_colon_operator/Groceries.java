package double_colon_operator;

import java.util.ArrayList;
import java.util.List;

public class Groceries {

	/*
	 * The double colon (::) operator is a special lambda expression. This operator
	 * is also known as method reference operator.
	 * 
	 * Where can we use the double colon operator (::)? - Static method, - Instance
	 * method, - Constructors.
	 * 
	 * Syntax: (ClassName :: methodName)
	 */

	public static void items(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apples");
		list.add("Milk");
		list.add("Rice");
		list.add("Sugar");

		list.forEach(Groceries::items);
	}

}
