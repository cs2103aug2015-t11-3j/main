package parser;

/**
 * Accepted time formats
 * 2359
 * 23:45
 * 23
 * 23.45
 */



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import application.Constants;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class TimeParser {

	static Calendar calendar = Calendar.getInstance();

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String timeString = sc.nextLine();
		System.err.println(displayTime(timeString));
		System.err.println(displayFullTime(timeString));
		sc.close();
	}

	public static int getHourOfDay(String time) {
		return formatTime(time).get(Calendar.HOUR_OF_DAY);
	}
	public static int getHour (String time) {
		if (formatTime(time).get(Calendar.HOUR)==0) {
			return 12;
		} else {
			return formatTime(time).get(Calendar.HOUR);
		}
	}
	public static int getMinute(String time) {
		return formatTime(time).get(Calendar.MINUTE);
	}
	public static String getAmPm (String time) {
		if (formatTime(time).get(Calendar.AM_PM)==0) {
			return "AM";
		} else {
			return "PM";
		}
	}

	public static Calendar formatTime(String time) {
		for (String formatString : Constants.timeFormats) {
			try {
				calendar.setTime(new SimpleDateFormat(formatString).parse(time));
				return calendar;
			} catch (ParseException e) {

			}
		}
		return null;
	}
	public static String displayFullTime(String time) {
		return String.format("%02d%02d hrs", getHourOfDay(time), getMinute(time));
	}
	public static String displayTime(String time) {
		return String.format("%02d:%02d", getHour(time), getMinute(time)) + " " + getAmPm(time);
	}
	
	public static Date getEndTime(String input){
		DateTime endTime = DateTime.now();
		String endTimeText = TaskParser.splitInputWithDictionary(Constants.TASK_END_TIME, input);
		Date newTime;
		
		for (String formatStr : Constants.timeFormats) {
			try {
				endTime = DateTimeFormat.forPattern(formatStr).parseDateTime(endTimeText);
				newTime = endTime.toLocalDateTime().toDate();
				return newTime;
			} catch (NullPointerException e) {

			} catch (IllegalArgumentException e){
				
			}
		}
		
		return null;
	}
}