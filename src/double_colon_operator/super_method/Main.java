package double_colon_operator.super_method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Test {

	public String print(String s) {
		return ("Hello " + s + "\n");
	}
}

public class Main extends Test {

	@Override
	public String print(String s) {

		Function<String, String> func = super::print;

		String newValue = func.apply(s);
		newValue += "Bye " + s + "\n";
		System.out.println(newValue);

		return newValue;
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Bob!");
		list.add("Alice!");
		list.add("Mario!");
		list.add("Charlie!");

		list.forEach(new Main()::print);

	}

}
