package streams.generation;

import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// Streams can take any data type
		Stream.of(4, 8, 9, 12, 42, 50).forEach(System.out::println);

		Stream.generate(() -> "Hello").limit(5).forEach(System.out::println);
		
		List.of(4, 8, 9, 12, 42, 50).stream().forEach(System.out::println);;
	}

}
