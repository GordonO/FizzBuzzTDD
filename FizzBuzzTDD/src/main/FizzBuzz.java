package main;

public class FizzBuzz {
	
	public String getFizzBuzz(Integer inputNumber){
		
		if(setFizz(inputNumber) == "Fizz" & setBuzz(inputNumber) == "Buzz")
			return setFizz(inputNumber) + setBuzz(inputNumber);
		
		if(setFizz(inputNumber) == "Fizz")
			return setFizz(inputNumber);
		
		if(setBuzz(inputNumber) == "Buzz")
			return setBuzz(inputNumber);
		
		return inputNumber.toString();
	}
	
	public String setFizz(int fizzNumber){
		
		if(fizzNumber % 3 == 0)
			return "Fizz";
		else
			return "No";
	}
	
	public String setBuzz(int buzzNumber){
		
		if(buzzNumber % 5 == 0)
			return "Buzz";
		else
			return "No";
	}
	
	public String[] getFizzBuzzArray(int arrayNumber){
		
		String[] fizzBuzzArray = new String[arrayNumber];
		
		for(int i = 0; i <= arrayNumber - 1; i++){
			
			fizzBuzzArray[i] = getFizzBuzz(i + 1);
		}
		
		return fizzBuzzArray;
	}
}
