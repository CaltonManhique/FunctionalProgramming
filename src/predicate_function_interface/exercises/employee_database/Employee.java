package predicate_function_interface.exercises.employee_database;

public class Employee {

	private String name;
	private String department;
	private char gender; // F - female, M - male, D - divers

	public Employee(String name, String department, char gender) {
		this.name = name;
		this.department = department;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [" + name + ", " + department + ", gender: " + gender + "]";
	}

}
