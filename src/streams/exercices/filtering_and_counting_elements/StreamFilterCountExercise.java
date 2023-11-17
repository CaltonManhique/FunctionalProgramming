package streams.exercices.filtering_and_counting_elements;

import java.util.List;
import java.util.function.Predicate;

class Book {

	private String title;
	private String author;
	private int year;

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Book: " + title + ", by " + author + ", " + year;
	}

}

public class StreamFilterCountExercise {

	public static long filterAndCount(List<Book> books, Predicate<Book> predicate) {
		return books.stream().filter(predicate).count();
	}

	public static void main(String[] args) {

		var books = List.of(new Book("Head First Java", "Sierra & Bates", 2023),
				new Book("Java for Dummies", "Barry A. Burd", 2023), new Book("Clean Code", "Robert C. Martin", 2023),
				new Book("Core Java: Fundamentals, V1", "Cays S. Horstmann", 2018),
				new Book("Java Kompendium: Professionell Java programmieren lernen", "Markus Neumann", 2019));

		Predicate<Book> predicate = p -> p.getYear() > 2020;

		long count = filterAndCount(books, predicate);
//		long count = filterAndCount(books, p -> p.getYear() > 2020); // short way

		books.forEach(System.out::println);

		System.out.println("\nBooks published after 2020: " + count);
	}

}
