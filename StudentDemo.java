import java.util.Scanner;
public class StudentDemo {

	 public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the array size:");
	        int n = input . nextInt();
	        String temp = input.nextLine();
	         String name;
	         String id;
	         String dept;
	        Student s[]  = new Student[n];
	        
	     
	        for(int i=0;i<n;i++)
	        { 
	        	System.out.println("\nEnter data for student "+(i+1));
				
				System.out.println();
				
				System.out.print("NAME:   ");
				name = input.nextLine();
				
				System.out.print("ID:   ");
				id = input.nextLine();
				
				System.out.print("DEPARTMENT:   ");
				dept = input.nextLine();
				
				s[i] = new Student(name, id, dept);
	          
	        }
	     for(int i=0;i<n;i++)
	     {
	      s[i] .display();
	     }
	    }
	    }


