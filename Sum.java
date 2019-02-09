import java.util.Scanner;
public class Sum {
    public  int s (int a, int b)
    {
      
      return a+b;
    }
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of i:");
        int i = input.nextInt();
        System.out.println("Enter the value of j:");
        int j = input.nextInt();
        Sum h = new Sum();
        h.s(i,j);
        int k = h.s(i,j);
        
        
        System.out.println("Sum of two number is :"+k);
    }
}

