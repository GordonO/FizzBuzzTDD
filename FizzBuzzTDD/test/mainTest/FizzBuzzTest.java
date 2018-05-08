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
		assertEquals("Fizz",fizzBuzz.decision(3));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
		assertEquals("Fizz",fizzBuzz.decision(6));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAFiveItReturnsBuzz(){
		assertEquals("Buzz",fizzBuzz.decision(5));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz(){
		assertEquals("Buzz",fizzBuzz.decision(10));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeAndFiveItReturnsFizzBuzz(){
		assertEquals("FizzBuzz",fizzBuzz.decision(15));
	}
	
	@Test
	public void whenFizzBuzzIsPassedANonMultipleOfThreeOrFiveItReturnsThatNumber(){
		assertEquals("1",fizzBuzz.decision(1));
	}

}
