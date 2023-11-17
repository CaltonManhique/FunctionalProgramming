package streams.exercices.filtering_and_mapping;

import java.util.List;
import java.util.stream.Collectors;

class Product {

	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product| " + name + ": " + price + "€";
	}

}

public class StreamExercise {

	public static List<String> processData(List<Product> products) {
		products.forEach(System.out::println);

		System.out.println("\n**** Filtered list *****");
		products.stream().filter(p -> p.getPrice() < 50).forEach(System.out::println);

		System.out.println("\n**** Mapped list *****");
		return products.stream().filter(p -> p.getPrice() > 50).map(p -> p.getName()).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		var products = List.of(new Product("Hammer", 45), new Product("Meat", 10), new Product("Rice", 5),
				new Product("Wine", 55), new Product("Bean", 6), new Product("Vodka", 55));

		processData(products).forEach(System.out::println);;

	}

}
