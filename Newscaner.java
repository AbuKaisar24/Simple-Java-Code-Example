import java.util.Scanner;

public class Newscaner {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
System.out.print("Enter the number for radious: ");
double radius=input.nextDouble();
double area=radius*radius*3.1416;
System.out.println("Area of circle is:"+area);




	}

}
