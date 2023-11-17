package double_colon_operator.custom_objects;

import java.util.ArrayList;
import java.util.List;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void someMethod() {
		System.out.println(this.name);
	}
}

public class Main {

	/*
	 * Custom Objects: Syntax (ClassName::methodName)
	 */

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Bob"));
		list.add(new Person("Alice"));
		list.add(new Person("Charlie"));
		
		list.forEach(Person::someMethod);
	}

}
