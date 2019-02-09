package javaprogramming;
import java.util.Scanner;
public class Sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);	
System.out.print("Enetr the valur of n:");
int n =input.nextInt();
int a,sum=0;
for (a=0;a<n;a++)
{
	System.out.print("\nthe value of a is :"+a);
}
for(a=0;a<n;a++)
{
	sum = sum+a;
}
System.out.print("\nSum of a is :"+sum);
}
}
