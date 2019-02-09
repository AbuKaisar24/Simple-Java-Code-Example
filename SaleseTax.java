package javaprogramming;
import java.util.Scanner;
public class SaleseTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter the purchase amount : ");
double a = input.nextDouble();
double tax = a * 0.06;
double total = tax *100 / 100.0;
System.out.println("Sales tax is :$ "+total);
	}

}
