package parallel_streams_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		File files = new File("names.txt");
		
		List<String> text = Files.readAllLines(files.toPath());
		
		text.parallelStream().forEach(System.out::println);
	}

}
