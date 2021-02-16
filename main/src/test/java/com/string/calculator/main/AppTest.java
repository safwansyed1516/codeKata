package com.string.calculator.main;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	@Test
	public void testEmptyString() {
		assertEquals(0, App.add(""));
	}
}
