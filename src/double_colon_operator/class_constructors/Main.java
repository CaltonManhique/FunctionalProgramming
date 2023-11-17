package double_colon_operator.class_constructors;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main(String s) {
		System.out.println("Hello " + s);
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Bob");
		list.add("Alice");
		list.add("Charlie");

		list.forEach(Main::new);

	}

}
