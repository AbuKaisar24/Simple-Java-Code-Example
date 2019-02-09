
public class Employee2 {
	private String name;
	private String id;
	private String designation;
	private double salary;
	
	public Employee2(String name ,String id)
	{
		this.name = name;
		this.id = id;
	}
	public void setdesignation(String a)
	{
		designation = a;
	}
	public void setsalary(double b)
	{
		salary = b;
	}
	public String getname()
	{
		return name;
	}
	public String getid()
	{
		return id;
	}
	public String getdesignation()
	{
		return designation;
	}
	public double getsalary()
	{
		return salary;
	}
	
}
class Sample{
	public static void main(String[] args) {
	Employee2 i = new Employee2("kaiser","6759");
	i . setdesignation("Computer Engineer");
	i. setsalary(32000);
	String l = i.getname();
	String k = i.getid();
	String m = i.getdesignation();
	double n = i.getsalary();
	System.out.println(" name is :"+l);
	System.out.println(" id is :"+k);
	System.out.println(" designation is :"+m);
	System.out.println(" salary is : "+n);

}	

}


