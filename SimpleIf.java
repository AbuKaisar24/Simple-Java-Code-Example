import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        if (n % 5 == 0)
        {
        	System.out.print("Hi five");
        }
        if(n % 2 == 0)
        {
        	System.out.print("\nHi Even");
        }
        if(n % 2 != 0)
        {
        	System.out.println("\nHi odd");
        }
	}

}
