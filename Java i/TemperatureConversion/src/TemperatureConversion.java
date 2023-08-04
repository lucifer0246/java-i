import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        double temperature;
        double celsius;
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius :");
        celsius = sc.nextDouble();
        temperature = celsius + 273.15;
        fahrenheit = (celsius*9/5)+32;
        System.out.println("The temperature "+ celsius + " celsius after converting to kelvin becomes "+temperature);
        System.out.println("The temperature "+ celsius + " celsius after converting to fahrenheit becomes "+fahrenheit);

    }
}
