import java.util.Scanner;
public class Displaytime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of second : ");
int n = input.nextInt();
int m = n / 60 ;
int s = n % 60 ;
System.out.println("second "+n+" minitus "+m+" and reamining second is  "+s);
	}

}
