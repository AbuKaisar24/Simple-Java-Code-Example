
public class Student {
   private String name;
   private String id;
   private String dept;
public  Student(String  name,String id,String dept)
{
    this.name = name;
    this.id = id;
    this.dept = dept; 
}   
public void display()
{
          
           
    System.out.println("\nname is :"+name);
    System.out.println("\nid is : "+id);
    System.out.println("\ndepertment is:"+dept);
}
}