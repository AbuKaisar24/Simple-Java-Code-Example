import java. util.Scanner;
public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter the score: ");
double a =input.nextDouble();
if(a>90)
{

	System.out.println(" increses pay 3% is :"+ a*0.03);
	
}
else
{
	System.out.println("increase amount 1% is: "+a*0.01);
}
	}

}
