package predicate_function_interface.exercises.employee_database;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeDatabase {

	public List<String> transformEmployeeNames(List<Employee> employees, Function<Employee, String> function) {
		List<String> names = new ArrayList<String>();
		String result;

		for (Employee emp : employees) {
			if (emp.getGender() == 'F') {
				result = function.apply(emp);
				names.add("Ms. " + result);
			} else if (emp.getGender() == 'M') {
				result = function.apply(emp);
				names.add("Mr. " + result);
			} else {
				result = function.apply(emp);
				names.add(result);
			}
		}

		return names;
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		List<Employee> filteredEmployees = new ArrayList<>();
		for (Employee employee : employees) {
			if (predicate.test(employee)) {
				filteredEmployees.add(employee);
			}
		}
		return filteredEmployees;
	}

	public void run() {

		List<Employee> employees = new ArrayList<>(List.of(new Employee("Alice", "HR", 'F'),
				new Employee("Bo", "Dev", 'M'), new Employee("Charlie", "HR", 'M'), new Employee("Dan", "People", 'D'),
				new Employee("Ella", "HR", 'D'), new Employee("Frank", "HR", 'M'), new Employee("George", "Dev", 'D'),
				new Employee("Irina", "Dev", 'F'), new Employee("Jan", "Dev", 'D')));

		System.out.println("***** Employees's list *******\n");
		employees.forEach(System.out::println);

		System.out.println("\n***** Female Employees *******");
		List<Employee> filteredEmployees = filterEmployees(employees, employee -> employee.getGender() == 'F');
        filteredEmployees.forEach(System.out::println);
		
		System.out.println("\n***** Employees's transformed list *******");
		List<String> names = transformEmployeeNames(employees, f -> f.getName());
		names.forEach(System.out::println);

	}

}
