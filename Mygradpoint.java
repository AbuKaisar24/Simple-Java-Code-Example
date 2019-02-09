import java.util.Scanner;
public class Mygradpoint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enetr your number :");
		
		double n = input . nextDouble();
		
		if( n<=100 && n>=80 )
		{
			System.out.println("A+");
		}
		else if(n<=79 && n>=75)
		{
			System.out.println("A");
		}
		else if(n<=74 && n>=70)
		{
			System.out.println("A-");
		}
		else if(n<=69 && n>=65)
		{
			System.out.println("B+");
		}
		else if(n<=64 && n>=60)
		{
			System.out.println("A");
		}
		else if(n<=59 && n>=55)
		{
			System.out.println("B-");
		}
		else if(n<=54 && n>=50)
		{
			System.out.println("C+");
		}
		else if(n<=49 && n>=45)
		{
			System.out.println("C");
		}
		else if(n<=44 && n>=40)
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("F");
		}

	}

}
