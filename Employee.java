
public class Employee {
private String id ;
private String name;
private int age ;
private String designation;
private double salary;
	
		public void setinfo(String a , String b )
		{
			name = a;
			id = b;
		}
		public void setinfo2( int c , String d)
		{
			age = c;
			designation= d;
		}
		public void empsalary( double e)
		{
			salary = e;
		}
		public void display()
		{
			System.out.println(" name is :"+name);
			System.out.println(" id is :"+id);
			System.out.println(" age is :"+age);
			System.out.println(" designation is :"+designation);
			System.out.println(" salary is :"+salary);
			
		}

		public static void main(String[] args) {
			Employee ep = new Employee();
			ep.setinfo("Abul kalam", "161-15-6759");
			ep.setinfo2(32, "Softwere Engineer");
			ep.empsalary(32500);
			ep.display();
			
		}

}
