package mainTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.FizzBuzz;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz;
	
	@Before
	public void setup(){
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void whenFizzBuzzIsPassedAThreeItReturnsFizz() {
		assertEquals("Fizz",fizzBuzz.fizz(3));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
		assertEquals("Fizz",fizzBuzz.fizz(6));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAFiveItReturnsBuzz(){
		assertEquals("Buzz",fizzBuzz.buzz(5));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz(){
		assertEquals("Buzz",fizzBuzz.buzz(10));
	}

}
