package parallel_streams.exercises.concurrent_data_filtering_and_collecting;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelConcurrentFilteringChallenge {

	private static List<String> filterAndCollectConcurrently(List<String> words, int lengthThreshold) {
		return words.parallelStream().filter(w -> w.length() <= lengthThreshold).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var list = List.of("Alice", "Bob", "Charlie", "Thomas", "Isabel", "Anthony", "Francisco");
		int lengthThreshold = 5;
		
		List<String> filtered = filterAndCollectConcurrently(list, lengthThreshold);
		
		filtered.forEach(System.out::println);
	}

}
