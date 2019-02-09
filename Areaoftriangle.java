import java.util.Scanner;
public class Areaoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of a ,b ,c\n");
double a=input.nextDouble();
double b=input.nextDouble();
double c=input.nextDouble();
double  s = (a+b+c)/2;
double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of triangle is : "+area);

	}

}
