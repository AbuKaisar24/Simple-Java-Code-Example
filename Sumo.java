
public class Sumo {
public void sum(int a ,int b){
	System.out.println(" sum is a+b :"+(a+b));
}
public void sum(int x ,int y ,int z){
	System.out.println("sum of x+y+z is: "+(x+y+z));
}
public void sum ( double p , double q)
{
	System.out.println("sum of p+q is :"+(p+q));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sumo ob = new Sumo();
      ob . sum(12 , 44);
      ob . sum(122 ,133,155);
      ob .sum(1.55, 1.44);
	}

}
