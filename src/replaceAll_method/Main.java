package replaceAll_method;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		var values = new ArrayList<>(List.of(3, 4, 7, 8, 10));

		values.replaceAll(n -> n * n); // replaces all the numbers in the list multiplied by itself

		values.forEach(System.out::println);

		var names = new ArrayList<>(List.of("Maya", "Bob", "Charlie", "Ottie"));

		names.replaceAll(name -> "Hi! " + name);

		names.forEach(System.out::println);
	}

}
