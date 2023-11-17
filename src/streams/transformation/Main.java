package streams.transformation;

import java.util.List;

class Color {

	private String color;

	public Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color: " + color;
	}

}

public class Main {

	public static void main(String[] args) {

		var colors = List.of("Blue", "Red", "Purple", "White", "Yellow", "Green", "Black");

		colors.stream().map(Color::new).forEach(System.out::println); // or map(c -> new Color(c))
		
		long totalCount = colors.stream().count();
		System.out.println("Number of the elements in the list: " + totalCount);
	}

}
