import java.util.Scanner;
public class Useoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System .out.print("Enter the value of  a : ");
double a = input.nextDouble();
System.out.print("Enter the value of b : ");
double b = input.nextDouble();
double c = a + b;
double d = a - b;
double e = a * b;
double f = a / b;
double g = a % b;
System.out.println("the value of c is : "+c);
System.out.println("the value of d is : "+d);
System.out.println("the value of e is : "+e);
System.out.println("the value of f is : "+f);
System.out.println("the value of g is : "+g);
	}

}
