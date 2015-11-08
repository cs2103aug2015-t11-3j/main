package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import application.Constants;
import logic.BinSorter;
import logic.InvalidTimeException;
import logic.Task;
import logic.TaskBin;

public class SorterTest {
	static DateTime invalid = new DateTime(0,1,1,0,0);
	static DateTime date1 = new DateTime(2015,11,12,0,0);
	static DateTime date1_2 = new DateTime(2015,11,12,22,21);
	static DateTime date2 = new DateTime(2016,1,15,0,1);
	static DateTime date3 =  new DateTime(2015,12,11,0,0);
	static DateTime date4 = new DateTime(2015,11,15,0,0);
	static DateTime date5 = new DateTime(2016,10,20,0,0);
	static BinSorter sorter = new BinSorter();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSortArrayByTime() throws InvalidTimeException {
		boolean equals = true;
		Task[] taskArr = new Task[6];
		taskArr[0] = new Task("Floating task 1" ,new DateTime(0,1,1,0,0),new DateTime(0,1,1,0,0));//U,0
		taskArr[1] = new Task("task that recurs", date1, date1_2, date5, Constants.tag_weekly);
		//R
		taskArr[2] = new Task("A task for the past", new DateTime(1994,1,1,0,0), new DateTime(2001,1,1,0,0));
		//P
		taskArr[3] = new Task("������֧��", new DateTime(0,1,1,0,0),new DateTime(0,1,1,0,0) );
		//0
		taskArr[4] = new Task("zstarts and end at different year", new DateTime(2015,11,12,0,0), new DateTime(2016,1,15,0,1));
		//16
		taskArr[5] = new Task("Task ends before it starts", new DateTime(2015,12,11,0,0), new DateTime(2015,11,15,0,0));
		//15
		TaskBin testBin = new TaskBin();
		testBin.add(taskArr[0]);
		testBin.add(taskArr[1]);
		testBin.add(taskArr[2]);
		testBin.add(taskArr[3]);
		testBin.add(taskArr[4]);
		testBin.add(taskArr[5]);
		ArrayList<Task> expected = new ArrayList<Task>();
		expected.add(taskArr[2]);
		expected.add(taskArr[5]);
		expected.add(taskArr[4]);
		expected.add(taskArr[1]);
		expected.add(taskArr[0]);
		expected.add(taskArr[3]);
		
		
		ArrayList<Task> output = sorter.sortArrayByTime(testBin.returnAllInbox());
		for(int i = 0; i < 6; i++){
			System.out.println("The title is " + output.get(i).getTitle());
			System.out.println('\n');
			if(!output.get(i).equals(expected.get(i))){
				equals = false;
			}
		}
		assertTrue(equals);
		
	}

	@Test
	public void testSortArrayByAlpha() {
		fail("Not yet implemented"); // TODO
	}

}