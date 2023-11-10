package function_unaryoperator_interfaces;

import java.util.function.UnaryOperator;

public class Main {

	/*
	 * public interface Function<T,R> public interface UnaryOperator extends
	 * Function<T,R> UnaryOperator inherits the apply() from Function>T,R>
	 */

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
//		System.out.println(!true); // Unary operator

		calculate(5, n -> n * n); // This will return n squared
		calculate(8, n -> n + 1);
		calculate(8, n -> n * 2);
	}

	public void calculate(int value, UnaryOperator<Integer> process) {
		int results = process.apply(value);
		System.out.println(results);
	}
}
