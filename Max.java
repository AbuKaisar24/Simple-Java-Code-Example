import java.util.Scanner;
public class Max {
  public int m(int i , int j)
  {
	  if (i>j)
	  {
		  return i;
	  }
	  else 
	  {
		  return j;
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input  = new Scanner(System.in);
     System.out.println("Enter the value of a");
     int a = input . nextInt();
     System.out.println("Enetr the value of b");
     int b  = input .nextInt();
     Max ma = new Max();
     ma . m(a,b);
     int s = ma.m(a, b);
     System.out.println("Maximum number is :"+s);
	}

}
