package lambda_expressions.functional_interfaces_and_consumer;

import java.util.List;

@FunctionalInterface
interface StringOperation {

	public abstract String operate(String str);
}

@FunctionalInterface
interface DataProcessor {

	public abstract void process(String data);
}

public class LambdaExercise {

	public static void processData(List<String> list, DataProcessor dataProcessor) {
		list.forEach(str -> {
			dataProcessor.process(str);
		});
	}

	public static void main(String[] args) {

		var colors = List.of("Blue", "Black", "Yellow", "White", "Green", "Silver");

		StringOperation stringOperation = (str) -> str.toUpperCase();

		System.out.println("\n********* Data processor ***********");
		processData(colors, data -> {
			String result = stringOperation.operate(data);
			System.out.println(result);
		});

	}

}
