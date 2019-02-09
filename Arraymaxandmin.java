import java.util.Scanner;
public class Arraymaxandmin {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println("Enetr array size : ");
int n = input.nextInt();
int a[] = new int[n];
int i;
System.out.println("Enetr the array element: ");
for(i=0;i<n;i++)
{
	a[i] = input.nextInt();
}
System.out.println("Array value before reverse:");
for(i=0;i<n;i++)
{
	System.out.println(a[i]);
}
for(i=0;i<n/2;i++)
{
	int temp = a[i];
	a[i]=a[n-i-1];
	a[n-i-1]=temp;
}
System.out.println("Array value After reverse:");
for(i=0;i<n;i++)
{
	System.out.println(+a[i]);
}

int max = a[0];
int min = a[0];
for(i=0;i<n;i++)
{
	if(max<a[i])
	{
		max = a[i];
	}
	else if(min>a[i])
	{
		min = a[i];
	}

		
}
System.out.println("largest value of array:"+max);
System.out.println("smallest value of array:"+min);
	}

}
