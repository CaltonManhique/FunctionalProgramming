package double_colon_operator.instance_methods;

import java.util.ArrayList;
import java.util.List;

public class Car {

	/*
	 * Instance methods:
	 * Syntax: (objectOfClass::methodName)
	 */
	
	public void brands(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Volvo");
		list.add("BMW");
		list.add("Mercedez Benz");
		list.add("Skoda");
		list.add("Link & Co");
		
		list.forEach(new Car() :: brands);
	}

}
