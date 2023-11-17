package double_colon_operator.exercises.instance_method_ref_with_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isAdult() {
		return age >= 18;
	}

}

public class Application {

	public static List<Person> filterAdults(List<Person> persons, Predicate<Person> predicate) {
		return persons.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var persons = new ArrayList<Person>(List.of(new Person("Thomas", 60), new Person("Angela", 50),
				new Person("John", 16), new Person("Bob", 18), new Person("Tilda", 45), new Person("Lucy", 17),
				new Person("Isabel", 19)));

		List<Person> adults = filterAdults(persons, Person::isAdult);
		adults.forEach(p -> System.out.println(p.getName()));
	}

}
