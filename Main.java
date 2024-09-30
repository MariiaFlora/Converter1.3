package app;

public class Main {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for converting temperature measures.");
        System.out.println("Version 1.0.");
    }
}
