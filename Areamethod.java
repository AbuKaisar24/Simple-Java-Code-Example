
public class Areamethod {
	final double pi =3.1416;
	double area;
	public void areaofcircle(double r)
	{
		
		area= r*r*pi; 
	}
public static void main(String[] args){
	
	Areamethod b = new Areamethod();
	b.areaofcircle(5);
	b.display();
	
}
public void display()
{
	System.out.printf(" area of circle is"+area);
}
}

