package functional_programming;

import java.util.List;
import java.util.function.Consumer;

public class Main {

	// Functional Interface is an interface that has one method in it.

	public static void main(String[] args) {

		var list = List.of("red", "blue", "pink");
		list.forEach(new Consumer<String>() { // Anonymous class 

			@Override
			public void accept(String t) {

				System.out.println(t);
			}
		}); // Consumer Interface is a functional Interface
		
		System.out.println();
		
		// Lambda expressions 
		list.forEach(System.out::println);
		
		System.out.println("\nLambda expressions");
		
		list.forEach(s -> {
			System.out.print(s);
			System.out.print(" ");
		});
	}


}
