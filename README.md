# fizzbuzz

The fizzbuzz class  produces the following for any contiguous range of integers:
- The number.
- ‘fizz’ for numbers that are multiples of 3.
- ‘buzz’ for numbers that are multiples of 5.
- ‘fizzbuzz’ for numbers that are multiples of 15.
- ‘lucky’ for numbers that contain a three. This overrides any existing behavior.

And it produces a report at the end of the output showing how many times they were printed.

## Example
```
FizzBuzz fb = new FizzBuzz();
System.out.println(fb.fizzBuzzWithRangeWithCountInfo(1, 20)));

//Running the program with a range from 1-20 should produce the following result:
//"1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"
```
## JUnit test cases
You can see the full test cases at com.yoursungjin.fizzbuzz.FizzBuzzTest. </br>
JUnit 4 was used.

## Author
Sungjin Lee.

