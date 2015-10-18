package parser;

import org.joda.time.DateTime;

public interface ParserInterface {
	String getCommand(String input);
	String getTitle(String input);
	String getStart(String input);
	String getEnd(String input);
	String getField(String input);
	DateTime getStartDateTime(String input);
	DateTime getEndDateTime(String input);
	int getIndex(String input);
	Boolean isValidEndingTime(DateTime startTime, DateTime endTime);
}