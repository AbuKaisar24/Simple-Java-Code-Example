import java.util.Scanner;
public class AlphabetorDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Alphabet or digit or Spcial character:");
	     String ch= input.next();
	     char c = ch.charAt(0);
		
		if((c >= 'a' && c <= 'z') || (c>= 'A' && c <= 'Z'))
	    {
	       System.out.printf("\n is ALPHABET "+ ch);
	    }
	    else if(c >= '0' && c <= '9')
	    {
	       System.out. printf("\n is DIGIT"+ ch);
	    }
	    else
	    {
	        System.out.printf("\nis SPECIAL CHARACTER"+ ch);
	    }
	 
	 
	} 

	}


