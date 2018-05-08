package main;

public class FizzBuzz {
	
	public String decision(int number){
		
		String sFizz, sBuzz, sDecision;
		
		sDecision = "";
		sFizz = fizz(number);
		sBuzz = buzz(number);
		
		if(sFizz == "Fizz") sDecision = sFizz;
		if(sBuzz == "Buzz") sDecision = sDecision + sBuzz;
		
		return sDecision;
	}
	public String fizz(int number){
		
		if(number % 3 == 0) return "Fizz";
		else return "NO";
	}
	
	public String buzz(int number){
		
		if(number % 5 == 0) return "Buzz";
		else return "NO";
	}
}
