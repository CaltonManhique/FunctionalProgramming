package lambdas.with_single_parameter;

@FunctionalInterface
interface MyInterface {
	void start(String text);
}

public class Main {

	public static void main(String[] args) {

		MyInterface lambda1 = (String text) -> {
			System.out.println(text);
		};
		lambda1.start("Hello!");

		MyInterface lambda2 = (t) -> {
			System.out.println(t);
		};
		lambda2.start("Hello!");

		MyInterface lambda3 = t -> {
			System.out.println(t);
		};
		lambda3.start("Hello!");

		MyInterface lambda4 = t -> System.out.println(t);
		lambda4.start("Hello!");
	}

}
