package predicate_function_interface.exercises.unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentRecords {

	public List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
		List<Student> list = students;
		list.removeIf(predicate);
		return list;
	}

	public List<String> transformStudentNames(List<Student> students, Function<Student, String> function) {
		List<String> graduatingStudents = new ArrayList<>();

		for (Student student : students) {
			if (student.getGpa() >= 2.5) {
				graduatingStudents.add(function.apply(student));
			}
		}
		return graduatingStudents;
	}

	public void run() {
		List<Student> students = new ArrayList<>(
				List.of(new Student("alice", 20, 3.0), new Student("bo", 22, 2.7), new Student("charlie", 21, 3.3),
						new Student("dan", 23, 2.4), new Student("ella", 22, 3.5), new Student("frank", 25, 3.9),
						new Student("george", 23, 2.5), new Student("irina", 22, 3.4), new Student("jan", 21, 3.6)));
		students.forEach(System.out::println);

		System.out.println("\n***** Approved students ******");

		double gpa = 2.5;
		List<Student> enrolledStudents = filterStudents(students, p -> p.getGpa() < gpa);
		enrolledStudents.forEach(System.out::println);

		System.out.println("\n***** Graduated students ******");
		List<String> graduatedStudents = transformStudentNames(students, (student) -> student.getName() + " Graduated");
		graduatedStudents.forEach(System.out::println);
	}
}
