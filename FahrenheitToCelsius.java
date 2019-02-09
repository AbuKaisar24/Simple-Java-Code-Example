import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of Fahrenheit: ");
double f = input.nextDouble();
double c = 5.0 * (f - 32) / 9 ;
System.out.println("Fahrenheit "+f+" is "+c+" in Celsius");
}

}
