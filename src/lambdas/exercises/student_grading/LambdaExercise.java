package lambdas.exercises.student_grading;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

	public static List<String> gradeStudents(List<Employee> list) {
		List<String> arr = new ArrayList<String>();

		list.forEach(student -> {
			String str = student.getScore() >= 90 ? "A"
					: student.getScore() >= 80 ? "B"
							: student.getScore() >= 70 ? "C" : student.getScore() >= 60 ? "D" : "F";
			arr.add(student.getName() + ", grade: " + str + "\n");
		});

		return arr;
	}

	public static void main(String[] args) {

		List<Employee> students = new ArrayList<Employee>();
		students.add(new Employee("Bob", 90));
		students.add(new Employee("John", 80));
		students.add(new Employee("Leo", 70));
		students.add(new Employee("Fred", 60));
		students.add(new Employee("Tommy", 59));
		students.add(new Employee("Alicia", 79));

		System.out.println("********* Original student list *********");
		students.forEach(System.out::println);

		System.out.println("\n********* Scored student list *********");
		System.out.println(gradeStudents(students));

	}

}
