import java.util.Scanner;
public class Averagesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enetr the array size: ");
int n =input.nextInt();
int a[] = new int[n];
System.out.println("Enter the array element:");
int i,sum=0;
for(i=0;i<n;i++)
{
	a[i] = input.nextInt();
}
for(i=0;i<n;i++)
{
	sum=sum+a[i];
}
double avg =sum / 10 ;
System.out.println("average of number is : "+avg);
	}

}
