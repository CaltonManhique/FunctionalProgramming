package intstreaminterface;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		IntStream ordered = IntStream.rangeClosed(1, 10);
		ordered.forEach(System.out::println);

		System.out.println("\nParallel stream");
		
		IntStream unOrdered = IntStream.rangeClosed(1, 10);
		unOrdered.parallel().forEach(System.out::println);
	}

}
