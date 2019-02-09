
public class Box {
private double width;
private double height;
private double depth;
Box()
{
	width = 1;
    height = 1;
    depth = 1;
}
Box( double w, double h,double d)
{
	width = w;
	height = h;
	depth = d;
}
Box( double len)
{
	width = height =depth =len;
}
Box(Box b)
{
	width = b.width;
	height = b.height;
	depth = b.depth;
}
double volume()
{
	return width *height * depth;
}
}
class Boxtest{
	
	public static void main(String[] args) {
	Box b1 = new Box();
	Box b2 = new Box(10,15,30);
	Box b3 = new Box(10);
	Box b4 = new Box(b2);
	System.out.println(" volum is "+b1.volume());

	}

}
