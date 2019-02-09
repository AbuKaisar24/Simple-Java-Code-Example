
public class Animal {
public void eat()
{
	System.out.println("Animal eats");
}
public void shit()
{
   System.out.println("Animal shit");	
}
}
 class Cat extends Animal{
	 public void eat()
	 {
		 System.out.println("Cat eat");
	 }
	 public void shit()
	 {
		 System.out.println("Cat shit");
	 }
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.shit();
		Cat c = new Cat();
		c.eat();
		c.shit();
		

	}

}
