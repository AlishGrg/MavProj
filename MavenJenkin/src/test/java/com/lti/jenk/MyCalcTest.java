package com.lti.jenk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCalcTest {

	@Test
	void test() {
		assertEquals(40,new MyCalc().getSum(20, 20));
	}
	@Test
	void test1() {
		assertEquals(0,new MyCalc().getDiff(20, 20));
	}

}
