package javaprogramming;

public class Currenttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long totalMilliseconds = System.currentTimeMillis();

long totalSecond = totalMilliseconds / 1000;

long currentSecond = totalSecond % 60 ;

long totalMinutes = totalSecond / 60;

long currentMinutes = totalMinutes % 60 ;

long totalHours = totalMinutes /60 ;

long currentHours = totalHours % 24;

System.out.println("current time is  "+currentHours+" : "+currentMinutes+" : "+currentSecond+" GMT");

	}

}
