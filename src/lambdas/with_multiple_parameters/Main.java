package lambdas.with_multiple_parameters;

@FunctionalInterface
interface MyInterface {
	void start(String name, String lastName, int age);
}

public class Main {

	public static void main(String[] args) {

		MyInterface lambda = (n, l, a) -> System.out.println("Name: " + n + " " + l + ", Age: " + a);

		person(lambda);
	}

	public static void person(MyInterface lambda) {
		lambda.start("Bob", "Smith", 40);
	}

}
