import java.util.Scanner;
public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1 = (int ) (System.currentTimeMillis() % 10);
int n2 = (int) (System.currentTimeMillis() / 7 % 10);
Scanner input = new Scanner(System.in);
System.out.println("What is "+ n1 +" + "+ n2 +" ?" );
int n = input.nextInt();

int answer=1;
System.out.println(n1+"+"+n2+" = "+(n1+n2)+" \nanswer is "+ (n1 + n2 == answer) );


	}

}
