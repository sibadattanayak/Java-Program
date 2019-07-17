import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch{
	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);

	System.out.println("Time has started. Press X to stop the time");
		 
		String time1= " "+java.time.LocalTime.now();
		System.out.println(time1);
	String X=sc.nextLine();
		String time2 =" "+java.time.LocalTime.now();
 		System.out.println(time2);
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		System.out.println((difference/1000)+" sec ");
	
}
}