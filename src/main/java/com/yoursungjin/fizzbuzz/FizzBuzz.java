package com.yoursungjin.fizzbuzz;

public class FizzBuzz {

	int num_of_fizz;
	int num_of_buzz;
	int num_of_fizzbuzz;
	int num_of_lucky;
	int num_of_integers;

	public FizzBuzz() {
		initVariables();
	}

	void initVariables() {
		num_of_fizz = 0;
		num_of_buzz = 0;
		num_of_fizzbuzz = 0;
		num_of_lucky = 0;
		num_of_integers = 0;
	}

	public String fizzBuzzWithRangeWithCountInfo(int s, int e) {
		initVariables();
		StringBuilder sb = new StringBuilder();
		sb.append(fizzBuzzWithRange(s, e));
		sb.append(" ");
		sb.append(countInformation());
		return sb.toString();
	}

	String fizzBuzzWithRange(int startIndex, int endIndex) {
		if (startIndex > endIndex)
			throw new IllegalArgumentException("The startIndex can not be greater than the endIndex.");

		StringBuilder sb = new StringBuilder();

		for (int i = startIndex; i <= endIndex; i++) {
			sb.append(fizzBuzz(i));
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	String fizzBuzz(int i) {

		if (containsThree(i)) {
			num_of_lucky++;
			return "lucky";
		}

		if (isMultipleOfThree(i) && isMultipleOfFive(i)) {
			num_of_fizzbuzz++;
			return "fizzbuzz";
		} else if (isMultipleOfThree(i)) {
			num_of_fizz++;
			return "fizz";
		} else if (isMultipleOfFive(i)) {
			num_of_buzz++;
			return "buzz";
		} else {
			num_of_integers++;
			return String.valueOf(i);
		}

	}

	boolean containsThree(int i) {
		while (i != 0) {
			if (i % 10 == 3 || i % 10 == -3)
				return true;
			i = i / 10;
		}
		return false;
	}

	boolean isMultipleOfThree(int i) {
		return (i % 3 == 0) ? true : false;
	}

	boolean isMultipleOfFive(int i) {
		return (i % 5 == 0) ? true : false;
	}

	String countInformation() {
		return countFizz() + " " + countBuzz() + " " + countFizzBuzz() + " " + countLucky() + " " + countInteger();
	}

	String countFizz() {
		return "fizz:" + " " + num_of_fizz;
	}

	String countBuzz() {
		return "buzz:" + " " + num_of_buzz;
	}

	String countFizzBuzz() {
		return "fizzbuzz:" + " " + num_of_fizzbuzz;
	}

	String countLucky() {
		return "lucky:" + " " + num_of_lucky;
	}

	String countInteger() {
		return "integer:" + " " + num_of_integers;
	}

}
