package parallel_streams_vs_sequencial_streams.exercises.filtering_challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringChallenge {

	private static List<Integer> sequentialFilterExample(List<Integer> numbers) {
		return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

	private static List<Integer> parallelFilterExample(List<Integer> numbers) {
		return numbers.parallelStream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));

		long seqInicialTime = System.currentTimeMillis();
		sequentialFilterExample(list).forEach(System.out::println);
		long seqFinalTime = System.currentTimeMillis();

		System.out.println("Sequencial time execution: " + (seqFinalTime - seqInicialTime) + "\n");

		long parInicialTime = System.currentTimeMillis();
		parallelFilterExample(list).forEach(System.out::println);
		long parFinalTime = System.currentTimeMillis();

		System.out.println("Parallel time execution: " + (parFinalTime - parInicialTime));

	}

}
