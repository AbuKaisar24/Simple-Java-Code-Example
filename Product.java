
public class Product {
private String code ;
private String description;
private double price;
public void setcode(String a)
{
	code =a;
}
public void setdescription(String b)
{
	description = b;
}
public void setprice( double c)
{
	price = c;
}
public void display()
{
	System.out.println(" Product code is:"+code);
	System.out.println(" description is :"+description);
	System.out.println(" price is : "+price);
}
	public static void main(String[] args) {
		
      Product p = new Product();
      p.setcode("ASUS AiO ET1620IUTT ");
      p.setdescription(" Touch All-in-One PC,Intel Pentium Dual Core G2030, 3.0 GHz,Intel HM61 Express Chipset,4 GB DDR3 RAM,500 GB HDD,Intel® HD Graphics.");
      p.setprice(43000);
      p.display();
	}

}
