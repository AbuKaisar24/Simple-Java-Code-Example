
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long totalMilliseconds = System.currentTimeMillis();

long totalSeconds = totalMilliseconds/1000;
long currentSeconds = totalSeconds%60;
long totalMinutes = totalSeconds/60;
long currentMinutes = totalMinutes%60;
long totalHour =totalMinutes/60;
long currentHour = totalHour%24;
System.out.println("Current time is "+currentHour+":"+currentMinutes+":"+currentSeconds+" GMT");





	}

}
