package random;
import java.util.Scanner;
public class Temp {
	
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        // Read the conversion type
	        System.out.println("Enter the String");
	        String conversionType = scan.nextLine();
	       
	        // Read the temperature value
	        System.out.println("Enter the temp");   
	        double a = scan.nextDouble();
	        
	        // Perform conversion based on type using switch
	        switch (conversionType) {
	            case "Celsius":
	                double fahrenheit = TemperatureConverter.celsiusToFahrenheit(a);
	                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	                break;
	            case "Fahrenheit":
	                double celsius = TemperatureConverter.fahrenheitToCelsius(a);
	                System.out.println("Temperature in Celsius: " + celsius);
	                break;
	        }
	        
	        scan.close();
	    }
	}

	class TemperatureConverter {
	    // Static method to convert Celsius to Fahrenheit
	    static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9.0 / 5.0) + 32.0;
	    }
	    
	    // Static method to convert Fahrenheit to Celsius
	    static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32.0) * 5.0 / 9.0;
	    }
	}


