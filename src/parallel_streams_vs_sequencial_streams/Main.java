package parallel_streams_vs_sequencial_streams;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("Normal streams");
		
		List<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		list.stream().forEach(System.out::println);
		
		System.out.println("\nParallel streams");
		
		list.parallelStream().forEach(System.out::println);
	}

}
