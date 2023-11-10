package predicate_function_interface.exercises.filtering_transforming_data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {
	private String name;
	private double price;
	private String category;

	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}

}

public class Main {

	public static List<String> transformProductNames(List<Product> products, Function<Product, String> function) {
		List<String> arr = new ArrayList<String>();

		for (Product p : products) {
			arr.add(function.apply(p));
		}

		return arr;
	}

	public static List<Product> filterProducts(List<Product> products, Predicate<Product> predicate) {
		List<Product> filteredProducts = new ArrayList<>();

		for (Product product : products) {
			if (predicate.test(product)) {
				filteredProducts.add(product);
			}
		}
		return filteredProducts;
	}

	// Calton and Jacques
	public static void main(String[] args) {

		List<Product> products = new ArrayList<>(List.of(new Product("iPhone", 1000, "Cell phones"),
				new Product("microwave", 150, "Kitchen Appliances"), new Product("PlayStation 5", 500, "Gaming"),
				new Product("Coffee Maker", 1000, "Kitchen Appliances"),
				new Product("Samsung Android", 700, "Cell phones"),
				new Product("Lenovo Laptop", 900, "Computers & Printers"),
				new Product("55 Samsung TV", 600, "Televisions"),
				new Product("Lenovo Laptop", 900, "Computers & Printers"),
				new Product("HP LaserJet", 350, "Computers & Printers"),
				new Product("BlueRay Player", 100, "Televisions"), new Product("Router", 800, "Computers & Printers"),
				new Product("Vacuum", 150, "Home Appliances"), new Product("Headphones", 50, "Cell Phones"),
				new Product("Call of Duty 5", 70, "Gaming"), new Product("Taylor Swift CD", 18, "Music"),
				new Product("Battery Bank", 20, "Cell Phones"), new Product("Gift Card", 50, "")));

		List<String> names = transformProductNames(products, f -> f.getName().toUpperCase());
		names.forEach(System.out::println);

		String filterCategory = "Gaming";
		List<Product> filteredProducts = filterProducts(products, p -> filterCategory.equals(p.getCategory()));
		filteredProducts.forEach(System.out::println);
	}

}
