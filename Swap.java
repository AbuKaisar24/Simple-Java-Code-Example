import java.util.Scanner;
 
public class Swap {
	
	int a, b, temp;
	Scanner scan;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		System.out.println("Integer Swapping method\n");
		
		System.out.println("Enter first value 'a' : ");
		a = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter second value 'b' : ");
		b = Integer.parseInt(scan.nextLine());
	}
	
	void swap() {
		
		System.out.println("\nBefore Swapping\na : " + a + " & b : " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("\nAfter Swapping\na : " + a + " & b : " + b);
	}

 

	
	public static void main(String args[]) {
		
		Swap obj = new Swap();
		
		obj.getVal();
		obj.swap();
	}
}