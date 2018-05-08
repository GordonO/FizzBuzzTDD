package main;

public class FizzBuzz {
	
	public String fizz(int number){
		
		if(number % 3 == 0) return "Fizz";
		else return "NO";
	}
	
	public String buzz(int number){
		
		if(number == 5) return "Buzz";
		else return "NO";
	}
}
