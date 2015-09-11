package com.evolutionnext.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;

import org.junit.Test;

public class CalcStatsTest {

	@Test
	public void testMinValWithNoElements() {

		List<Integer> integers = new ArrayList<Integer>();
		CalcStats calcStats = new CalcStats(integers);
		assertNull(calcStats.getMinimum());

	}
	

	@Test
	public void testMinValWithOneElements() {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(5), calcStats.getMinimum());

	}
	
	
	@Test
	public void testMinValWithMultipleElements() {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		integers.add(20);
		integers.add(1);
		integers.add(50);
		integers.add(100);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(1, calcStats.getMinimum(integers));

	}


}
