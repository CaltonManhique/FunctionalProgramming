package lambdas.exercises.calculator;

@FunctionalInterface
interface CalculatorInterface {
	public double calculate(double a, double b);
}

public class LambdaExercise {

	private static double performOperation(double a, double b, CalculatorInterface cal) {
		return cal.calculate(a, b);
	}

	public static void main(String[] args) {

		double value1 = 5;
		double value2 = 3;

		System.out.println("***** Addition *******");
		CalculatorInterface add = (a, b) -> a + b;
		double addResult = performOperation(value1, value2, add);
		System.out.println(value1 + " + " + value2 + " = " + addResult);

		System.out.println("\n***** Subtraction *******");
		CalculatorInterface sub = (a, b) -> a - b;
		double subResult = performOperation(value1, value2, sub);
		System.out.println(value1 + " - " + value2 + " = " + subResult);

		System.out.println("\n***** Multiplication *******");
		CalculatorInterface multiply = (a, b) -> a * b;
		double multiplyResult = performOperation(value1, value2, multiply);
		System.out.println(value1 + " * " + value2 + " = " + multiplyResult);

		System.out.println("\n***** Division *******");
		CalculatorInterface divide = (a, b) -> a / b;
		double divResult = performOperation(value1, value2, divide);
		System.out.println(value1 + " / " + value2 + " = " + divResult);
	}

}
