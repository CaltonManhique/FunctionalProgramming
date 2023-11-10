package lambdas.exercises.temperature_conversion;

@FunctionalInterface
interface TemperatureInterface {
	public double temperatureConversion(double tempeture);
}

public class LambdaExercise {

	public static double convertTemperature(TemperatureInterface temp, double value) {
		return temp.temperatureConversion(value);
	}

	
	public static void main(String[] args) {

		double temp1 = 30;
		double temp2 = 102;
		double temp3 = 150;
		
		System.out.println("Celsius to Fahrenheit");
		TemperatureInterface conversion1 = t -> (t * 1.8) + 32;
		System.out.println(temp1 + "°C = " + convertTemperature(conversion1, temp1) + "°F");
		
		System.out.println("\nFahrenheit to Celsius");
		TemperatureInterface conversion2 = t -> (t - 32) * 5/9;
		System.out.println(temp2 + "°F = " + convertTemperature(conversion2, temp2) + "°C");
		
		System.out.println("\nCelsius to Kelvin");
		TemperatureInterface conversion3 = t -> t  + 273.15;
		System.out.println(temp1 + "°C = " + convertTemperature(conversion3, temp1) + "K");
		
		System.out.println("\nKelvin to Celsius");
		TemperatureInterface conversion4 = t -> t  - 273.15;
		System.out.println(temp3 + "K = " + convertTemperature(conversion4, temp3) + "°C");
	}

}
