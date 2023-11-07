package lambda_expressions.employee_salary_calculation;

public class Employee {

	private String name;
	private Position position;
	private double salary;

	public Employee(String name, Position position, double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [" + name + ", " + position + ": " + salary + " €]";
	}

	public String getBonus(double percentage) {
		return name + " (" + position + ") " + (salary * percentage) + " € Bonus.\n";
	}

}
