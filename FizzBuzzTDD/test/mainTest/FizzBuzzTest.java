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
		assertEquals("Fizz",fizzBuzz.getFizzBuzz(3));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
		assertEquals("Fizz",fizzBuzz.getFizzBuzz(6));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAFiveItReturnsBuzz(){
		assertEquals("Buzz",fizzBuzz.getFizzBuzz(5));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz(){
		assertEquals("Buzz",fizzBuzz.getFizzBuzz(10));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeAndFiveItReturnsFizzBuzz(){
		assertEquals("FizzBuzz",fizzBuzz.getFizzBuzz(15));
	}
	
	@Test
	public void whenFizzBuzzIsPassedANonMultipleOfThreeOrFiveItReturnsThatNumber(){
		assertEquals("1",fizzBuzz.getFizzBuzz(1));
	}

}
