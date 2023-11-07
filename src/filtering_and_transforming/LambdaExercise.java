package filtering_and_transforming;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

	public static List<String> filterAndTransform(List<Person> listOfPerson) {
		List<String> list = new ArrayList<String>();

		if (listOfPerson.isEmpty()) {
			list.add("Empty list, impossible to perform transformation");
			return list;
		} else {
			listOfPerson.forEach(person -> {
				if (person.getAge() <= 30) {
					list.add(person.getName() + " - " + person.getCity());
				}

			});
		}

		return list;
	}

	public static void main(String[] args) {

		var persons = List.of(new Person("John", 18, "Berlin"), new Person("Anna", 28, "Prague"),
				new Person("Mary", 38, "Lisbon"), new Person("Susi", 32, "Porto"), new Person("Gunter", 30, "Hanover"));

		System.out.println("********* Transformed pesron list **********");
		System.out.println(filterAndTransform(persons));

		System.out.println("\n********* Original pesron list **********");
		persons.forEach(p -> {
			System.out.println(p);
		});

		System.out.println("\n********* Filtered pesron list **********");
		persons.forEach(p -> {
			if (p.getAge() > 30) {
				System.out.println(p);
			}
		});
	}
}
