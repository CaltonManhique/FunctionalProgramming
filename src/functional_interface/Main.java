package functional_interface;

@FunctionalInterface
interface Runner {

	void execute();
}

public class Main {

	public static void main(String[] args) {

		Runner run = () -> {
			System.out.println("Hello");
		};
		
		run.execute();
		System.out.println(run instanceof Runner);
		System.out.println(run.getClass());
		
	}

}
