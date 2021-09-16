package com.lti.jenk;

import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void test1() {
		assertEquals(25,new MyCalc().getSum(10, 15));
	}
	@Test
	public void test2() {
		assertEquals(40,new MyCalc().getSum(25, 15));
	}
	@Test
	public void test3() {
		assertEquals(5,new MyCalc().getDiff(15, 10));
	}
	@Test
	public void test4() {
		assertEquals(20,new MyCalc().getSum(22, 2));
	}

}
