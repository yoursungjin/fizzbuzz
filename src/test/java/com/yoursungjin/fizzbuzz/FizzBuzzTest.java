package com.yoursungjin.fizzbuzz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void runBeforeTestMethod() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testFizzBuzzWithRangeWithCountInfo() {
		assertEquals(
				"1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10",
				fizzBuzz.fizzBuzzWithRangeWithCountInfo(1, 20));
		assertEquals(
				"buzz -19 fizz -17 -16 fizzbuzz -14 lucky fizz -11 buzz fizz -8 -7 fizz buzz -4 lucky -2 -1 fizzbuzz fizz: 4 buzz: 3 fizzbuzz: 2 lucky: 2 integer: 10",
				fizzBuzz.fizzBuzzWithRangeWithCountInfo(-20, 0));
		assertEquals("fizzbuzz fizz: 0 buzz: 0 fizzbuzz: 1 lucky: 0 integer: 0",
				fizzBuzz.fizzBuzzWithRangeWithCountInfo(0, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFizzBuzzWithRangeWithCountInfoThrowsIllegalArgumentException() {
		fizzBuzz.fizzBuzzWithRangeWithCountInfo(1, 0);
		fizzBuzz.fizzBuzzWithRangeWithCountInfo(1, -3);
	}

	@Test
	public void testFizzBuzzWithRange() {
		assertEquals("buzz -4 lucky -2 -1 fizzbuzz", fizzBuzz.fizzBuzzWithRange(-5, 0));
		assertEquals("-2 -1 fizzbuzz 1 2", fizzBuzz.fizzBuzzWithRange(-2, 2));
		assertEquals("fizzbuzz 1 2", fizzBuzz.fizzBuzzWithRange(0, 2));
		assertEquals("1", fizzBuzz.fizzBuzzWithRange(1, 1));
		assertEquals("lucky", fizzBuzz.fizzBuzzWithRange(3, 3));
		assertEquals("buzz", fizzBuzz.fizzBuzzWithRange(5, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFizzBuzzWithRangeThrowsIllegalArgumentException() {
		fizzBuzz.fizzBuzzWithRange(1, 0);
		fizzBuzz.fizzBuzzWithRange(1, -1);
	}

	@Test
	public void testFizzBuzz() {
		assertEquals("fizzbuzz", fizzBuzz.fizzBuzz(15));
		assertEquals("lucky", fizzBuzz.fizzBuzz(13));
		assertEquals("buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("4", fizzBuzz.fizzBuzz(4));
		assertEquals("lucky", fizzBuzz.fizzBuzz(3));
		assertEquals("2", fizzBuzz.fizzBuzz(2));
		assertEquals("1", fizzBuzz.fizzBuzz(1));
		assertEquals("fizzbuzz", fizzBuzz.fizzBuzz(0));
		assertEquals("-1", fizzBuzz.fizzBuzz(-1));
		assertEquals("-2", fizzBuzz.fizzBuzz(-2));
		assertEquals("lucky", fizzBuzz.fizzBuzz(-3));
		assertEquals("-4", fizzBuzz.fizzBuzz(-4));
		assertEquals("buzz", fizzBuzz.fizzBuzz(-5));
		assertEquals("lucky", fizzBuzz.fizzBuzz(-13));
		assertEquals("fizzbuzz", fizzBuzz.fizzBuzz(-15));
	}

	@Test
	public void testContainsThree() {
		assertEquals(true, fizzBuzz.containsThree(33));
		assertEquals(true, fizzBuzz.containsThree(23));
		assertEquals(true, fizzBuzz.containsThree(13));
		assertEquals(true, fizzBuzz.containsThree(3));
		assertEquals(false, fizzBuzz.containsThree(1));
		assertEquals(false, fizzBuzz.containsThree(0));
		assertEquals(false, fizzBuzz.containsThree(-1));
		assertEquals(true, fizzBuzz.containsThree(-3));
		assertEquals(true, fizzBuzz.containsThree(-13));
		assertEquals(true, fizzBuzz.containsThree(-23));
		assertEquals(true, fizzBuzz.containsThree(-33));
	}

	@Test
	public void testIsMultipleOfThree() {
		assertEquals(true, fizzBuzz.isMultipleOfThree(-15));
		assertEquals(false, fizzBuzz.isMultipleOfThree(-5));
		assertEquals(true, fizzBuzz.isMultipleOfThree(-3));
		assertEquals(false, fizzBuzz.isMultipleOfThree(-1));
		assertEquals(true, fizzBuzz.isMultipleOfThree(0));
		assertEquals(false, fizzBuzz.isMultipleOfThree(1));
		assertEquals(true, fizzBuzz.isMultipleOfThree(3));
		assertEquals(false, fizzBuzz.isMultipleOfThree(5));
		assertEquals(true, fizzBuzz.isMultipleOfThree(15));
	}

	@Test
	public void testIsMultipleOfFive() {
		assertEquals(true, fizzBuzz.isMultipleOfFive(-15));
		assertEquals(true, fizzBuzz.isMultipleOfFive(-5));
		assertEquals(false, fizzBuzz.isMultipleOfFive(-3));
		assertEquals(false, fizzBuzz.isMultipleOfFive(-1));
		assertEquals(true, fizzBuzz.isMultipleOfFive(0));
		assertEquals(false, fizzBuzz.isMultipleOfFive(1));
		assertEquals(false, fizzBuzz.isMultipleOfFive(3));
		assertEquals(true, fizzBuzz.isMultipleOfFive(5));
		assertEquals(true, fizzBuzz.isMultipleOfFive(15));
	}

	@Test
	public void testCountInformation() {
		fizzBuzz.num_of_fizz = 1;
		fizzBuzz.num_of_buzz = 2;
		fizzBuzz.num_of_fizzbuzz = 3;
		fizzBuzz.num_of_lucky = 4;
		fizzBuzz.num_of_integers = 5;
		assertEquals("fizz: 1 buzz: 2 fizzbuzz: 3 lucky: 4 integer: 5", fizzBuzz.countInformation());

	}

	@Test
	public void testCountFizz() {
		fizzBuzz.num_of_fizz = 1;
		assertEquals("fizz: 1", fizzBuzz.countFizz());
	}

	@Test
	public void testCountBuzz() {
		fizzBuzz.num_of_buzz = 2;
		assertEquals("buzz: 2", fizzBuzz.countBuzz());
	}

	@Test
	public void testCountFizzBuzz() {
		fizzBuzz.num_of_fizzbuzz = 3;
		assertEquals("fizzbuzz: 3", fizzBuzz.countFizzBuzz());
	}

	@Test
	public void testCountLucky() {
		fizzBuzz.num_of_lucky = 4;
		assertEquals("lucky: 4", fizzBuzz.countLucky());
	}

	@Test
	public void testCountInteger() {
		fizzBuzz.num_of_integers = 5;
		assertEquals("integer: 5", fizzBuzz.countInteger());
	}

	@Test
	public void testInitVariables() {
		fizzBuzz.num_of_fizz = 1;
		fizzBuzz.num_of_buzz = 2;
		fizzBuzz.num_of_fizzbuzz = 3;
		fizzBuzz.num_of_lucky = 4;
		fizzBuzz.num_of_integers = 5;

		fizzBuzz.initVariables();

		assertEquals(0, fizzBuzz.num_of_fizz);
		assertEquals(0, fizzBuzz.num_of_buzz);
		assertEquals(0, fizzBuzz.num_of_fizzbuzz);
		assertEquals(0, fizzBuzz.num_of_lucky);
		assertEquals(0, fizzBuzz.num_of_integers);

	}

}
