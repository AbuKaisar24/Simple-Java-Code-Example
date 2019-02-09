
public class Summet {
int a;
int b;
int c;

public void sum(int a,int b)
{
	c=a+b;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Summet i = new Summet();
System.out.print("Enter the value of a: ");
int a=30;
System.out.println("Enter the value of b: ");
int b=46;

   i.sum(a,b);
   i.display();
   a=10;
   b=100;
i.sum(a, b);
i.display();
	}
public void display()
{
	System.out.println("sum :"+c);
}
}
