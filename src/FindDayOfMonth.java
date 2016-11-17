import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class FindDayOfMonth {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		int y=in.nextInt();
		int m=in.nextInt();
		int dd=in.nextInt();
		
		String res=String.valueOf(y)+String.valueOf(m)+String.valueOf(dd);
			
		
		SimpleDateFormat formatter = new SimpleDateFormat("EEE");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		java.util.Date d=sdf.parse(res);
		String text = formatter.format(d);
		System.out.println(text);
		
		if(text.equals("Sun"))
			System.out.println("SUNDAY");
		else if(text.equals("Mon"))
			System.out.println("MONDAY");
		else if(text.equals("Tue"))
			System.out.println("TUESDAY");
		else if(text.equals("Wed"))
			System.out.println("WEDNESDAY");
		else if(text.equals("Thu"))
			System.out.println("THURSDAY");
		else if(text.equals("Fri"))
			System.out.println("FRIDAY");
		else if(text.equals("Sat"))
			System.out.println("SATURDAY");
				
	}

}
