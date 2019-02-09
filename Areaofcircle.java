import java.util.Scanner;
public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter the radius:");
double radius = input.nextDouble();
final double pi=3.1416;
double area=radius*radius*pi;
System.out.println("Area of circle is :"+area);
	}

}
