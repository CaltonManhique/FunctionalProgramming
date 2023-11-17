package double_colon_operator.exercises.static_method_ref_with_predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringUtils {

	public static boolean isPalindrome(String s) {
		String rev = "";
		String[] original = s.trim().split("");

		for (int i = original.length - 1; i > -1; i--) {
			rev += original[i];
		}

		if (rev.equalsIgnoreCase(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static List<String> filterPalindromes(List<String> str, Predicate<String> predicate) {
		return str.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var list = List.of("Madam", "Radar", "Level", "Java", "Python", "Palindrome");

		List<String> palindrome = filterPalindromes(list, p -> isPalindrome(p));

		System.out.println("Palindromes words:");
		palindrome.forEach(System.out::println);

	}

}
