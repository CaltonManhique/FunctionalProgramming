package streams.collectors;

import java.util.List;
import java.util.stream.Collectors;

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

		var list = colors.stream().map(Color::new).collect(Collectors.toList()); // Terminal operation

		for(var color:list) {
			System.out.println(color.getClass());
			System.out.println(color);
		}
	}

}
