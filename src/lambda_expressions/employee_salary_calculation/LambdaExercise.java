package lambda_expressions.employee_salary_calculation;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

	public static List<String> calculateAnnualBonuses(List<Employee> employees) {
		List<String> arr = new ArrayList<String>();

		employees.forEach(emp -> {
			
			String bonus = null;
			Position pos = emp.getPosition();
			
			switch (pos) {
			case MANAGER -> bonus = emp.getBonus(0.15);
			case DEVELOPER -> bonus = emp.getBonus(0.10);
			case INTERN -> bonus = emp.getBonus(0.05);
			case UNRECOGNISED -> bonus = emp.getBonus(0.0);
			default -> throw new IllegalArgumentException("Unexpected value: " + pos);
			}
			
			arr.add(bonus);
		});

		return arr;
	}

	public static void main(String[] args) {

		var employees = List.of(new Employee("Mary", Position.MANAGER, 6000),
				new Employee("John", Position.DEVELOPER, 4000), new Employee("Tony", Position.INTERN, 3800),
				new Employee("Mike", Position.DEVELOPER, 4000), new Employee("Hugo", Position.INTERN, 3800),
				new Employee("Lisa", Position.MANAGER, 6000), new Employee("Dany", Position.UNRECOGNISED, 4000));
		
		employees.forEach(System.out::println);
		
		System.out.println("\n********** Annual bonuses **********");
		System.out.println(calculateAnnualBonuses(employees));
	}

}
