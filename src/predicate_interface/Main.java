package predicate_interface;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() < 5;
			}
		};

		System.out.println(p1.test("apple"));
		System.out.println(p1.test("pear"));

		Predicate<String> p2 = s -> s.length() < 5;

		System.out.println(p2.test("apple"));
		System.out.println(p2.test("pear"));
	}

}
