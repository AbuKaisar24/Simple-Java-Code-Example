import java.util.Scanner;

public class Box1 {
 double width;
 double height;
 double depth;
 double  vol()
 {
	 return width * height * depth;
 }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 box = new Box1();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the height:");
    double a = input.nextDouble();
    box. height = a;
    System.out.println("Enter the width:");
    double b = input.nextDouble();
    box. width = b;
    System.out.println("Enter the height:");
    double c = input.nextDouble();
    box.depth = c;
    double volum = box.vol();
    System.out.println("Volum of box is:"+volum);
    
	}

}
