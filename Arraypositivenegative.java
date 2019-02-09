import java.util.Scanner;
public class Arraypositivenegative {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enetr array size");
	int n = input.nextInt();
	int a[] = new int[n];
	int i;
	System.out.println("Enetr arra element");
	for(i=0;i<n;i++)
	{
		a[i] = input.nextInt();
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>=-1)
		{
			System.out.print("\npositive array is :"+a[i]);
		}
	}
	for(i=0;i<n;i++)
	{
		if(a[i]<=-1)
		{
			System.out.print("\nnegative array is :"+a[i]);
		}
	}

	}

}
