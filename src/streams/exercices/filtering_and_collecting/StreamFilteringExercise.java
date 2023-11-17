package streams.exercices.filtering_and_collecting;

import java.util.List;
import java.util.stream.Collectors;

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

public class StreamFilteringExercise {

	public static List<Book> filterAndCollect(List<Book> books) {

		return books.stream().filter(p -> p.getYear() < 2020).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var books = List.of(new Book("Head First Java", "Sierra & Bates", 2023),
				new Book("Java for Dummies", "Barry A. Burd", 2023), new Book("Clean Code", "Robert C. Martin", 2023),
				new Book("Core Java: Fundamentals, V1", "Cays S. Horstmann", 2018),
				new Book("Java Kompendium: Professionell Java programmieren lernen", "Markus Neumann", 2019));

		books.forEach(System.out::println);
		
		System.out.println("\n****** Filtered list ******");
		filterAndCollect(books).forEach(System.out::println);;
	}

}
