package predicate_interface.filtering_lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		var values = new ArrayList<>(List.of(3, 5, 6, 8, 20)); // Immutable collection of() Is not possible to add anything
		values.add(2); // 

		values.forEach(System.out::println);
		
		System.out.println("\n***** Filtering list ******");
		values.removeIf(n -> n <6);
		
		values.forEach(System.out::println);
	}

}
