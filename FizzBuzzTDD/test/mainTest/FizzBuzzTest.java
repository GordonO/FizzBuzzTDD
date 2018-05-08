package mainTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void whenFizzBuzzIsPassedAThreeItReturnsFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz",fizzBuzz.fizz(3));
	}

}
