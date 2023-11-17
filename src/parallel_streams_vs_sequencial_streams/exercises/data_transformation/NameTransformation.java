package parallel_streams_vs_sequencial_streams.exercises.data_transformation;

import java.util.List;
import java.util.stream.Collectors;

public class NameTransformation {

	private static List<String> sequentialStreamExample(List<String> names) {
		return names.stream().map(String::toUpperCase).collect(Collectors.toList());
	}

	private static List<String> parallelStreamExample(List<String> names) {
		return names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var list = List.of("Alice", "Bob", "Charlie", "Thomas", "Isabel", "Anthony");

		long seqInicialTime = System.currentTimeMillis();
		sequentialStreamExample(list).forEach(System.out::println);
		long seqFinalTime = System.currentTimeMillis();

		System.out.println("Sequencial time execution: " + (seqFinalTime - seqInicialTime) + "\n");

		long parInicialTime = System.currentTimeMillis();
		parallelStreamExample(list).forEach(System.out::println);
		long parFinalTime = System.currentTimeMillis();

		System.out.println("Parallel time execution: " + (parFinalTime - parInicialTime));
	}

}
