package streams.filter;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		var list = List.of(3, 4, 6, 12, 30);

		list.stream().filter(n -> n % 5 == 0).forEach(System.out::println);
		
		System.out.println();
		
		list.forEach(System.out::println);
	}

}
