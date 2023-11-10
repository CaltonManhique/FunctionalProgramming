package functional_interface;

@FunctionalInterface
interface Runner {

	void execute();
}

interface Greet {
	void greet();
}

public class Main implements Greet {

	public static void main(String[] args) {

		Runner run = () -> {
			System.out.println("Hello");
		};

		run.execute();
		System.out.println(run instanceof Runner);
		System.out.println(run.getClass());

	}

	@Override
	public void greet() {
		System.out.println("Hello");
	}

}
