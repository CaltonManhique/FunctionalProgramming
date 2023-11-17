package parallel_streams.exercises.string_lengths;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleParallelStreamChallenge {

	private static List<Integer> parallelStringLengths(List<String> words) {
		return words.parallelStream().map(String::length).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var list = List.of("Alice", "Bob", "Charlie", "Thomas", "Isabel", "Anthony", "Francisco");
		
		List<Integer> lenghts = parallelStringLengths(list);
		
		lenghts.forEach(System.out::println);
	}

}
