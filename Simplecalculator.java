import java.util.Scanner;
public class Simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Eneter the value of a: ");
int a = input . nextInt();
System.out.println("Eneter the value of b: ");
int b = input . nextInt();
System.out.println("What is your choice??");
System.out.println("\n1.Addition\n2.subtraction\n3.Multiplication\n4.Divition");
System.out.println("Please Enter your choice: ");
int ch = input . nextInt();
switch(ch)
{
case 1:
	System.out.println("Sum is: "+ (a + b));
	   break;
case 2:
	System.out.println("Subtraction is: "+ (a - b));
	break;
case 3:
	System.out.println("Multiplication is :"+ (a * b));
	break;
case 4:
	System.out.println("Division is : "+ (a / b));
	break;
	
}


	}

}
