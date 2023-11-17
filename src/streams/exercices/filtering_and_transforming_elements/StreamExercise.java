package streams.exercices.filtering_and_transforming_elements;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee| " + name + ": " + age + " years old.";
	}

}

public class StreamExercise {

	public static List<String> filterAndTransform(List<Employee> employees, Predicate<Employee> predicate,
			Function<Employee, String> function) {
		System.out.println("****** Original list ******");
		employees.forEach(System.out::println);

		System.out.println("\n****** Filtered list ******");
		employees.stream().filter(predicate).forEach(System.out::println);

		System.out.println("\n****** Transformed list ******");
		return employees.stream().filter(predicate).map(function).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var employees = List.of(new Employee("Thomas", 60), new Employee("Tommy", 25), new Employee("Susane", 31),
				new Employee("Gunter", 35), new Employee("Emilia", 23));

		Predicate<Employee> predicate = p -> p.getAge() > 30;
		Function<Employee, String> function = f -> "Older employee: " + f.getName();

		filterAndTransform(employees, predicate, function).forEach(System.out::println);

	}

}
