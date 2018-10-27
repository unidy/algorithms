package learn.stack;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import learn.utils.Print;

public class DailyTemperaturesTest {
	DailyTemperatures solution = new DailyTemperatures();

	@Test
//	@Ignore
	public void test() {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		
		Print.print(T);
		
		int[] r = solution.dailyTemperatures(T);
		
		Print.print(r);		
	}

	@Test
	public void test2() {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		
		Print.print(T);
		
		int[] r = solution.dailyTemperatures2(T);
		
		Print.print(r);		
	}

	@Test
	public void test3() {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		
		Print.print(T);
		
		int[] r = solution.dailyTemperatures3(T);
		
		Print.print(r);		
	}

	@Test
	public void test4() {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		
		Print.print(T);
		
		int[] r = solution.dailyTemperatures4(T);
		
		Print.print(r);		
	}
}
