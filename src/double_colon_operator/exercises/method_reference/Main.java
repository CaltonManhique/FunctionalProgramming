package double_colon_operator.exercises.method_reference;

public class Main {

	public static int addNumbers(int a, int b) {
		return a + b;
	}

	public static int subtractNumbers(int a, int b) {
		return b - a;
	}

	public static int multiplyNumbers(int a, int b) {
		return a * b;
	}

	public static int performOperation(int a, int b, MathOperation mathOperation) {

		return mathOperation.mathMethod(a, b);
	}

	public static void main(String[] args) {

		int sum = performOperation(4, 5, (a,b) -> addNumbers(a, b));
		System.out.println("Sum " + sum); 
		
		int sub = performOperation(4, 9, (a,b)-> subtractNumbers(a, b));
		System.out.println("Sub " + sub); 
		
		int mult = performOperation(5, 5, (a,b)->multiplyNumbers(a, b));
		System.out.println("Mult " + mult); 
	}

}
