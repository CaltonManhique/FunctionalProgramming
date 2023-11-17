package double_colon_operator.exercises.constructor_reference;

@FunctionalInterface
interface CarFactory {

	abstract Car carFactory(String make, String model, int year);
}

class Car {

	private String brand;
	private String model;
	private int year;

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

}

public class Application {

	public static Car createCar(CarFactory carFactory, String brand, String model, int year) {
		return carFactory.carFactory(brand, model, year);
	}

	public static void main(String[] args) {

		Car car = createCar(Car::new, "Toyota", "Corola", 2020);

		System.out.println(car.getBrand() + " - " + car.getModel() + " : " + car.getYear());
	}

}
