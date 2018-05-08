package main;

public class FizzBuzz {
	
	public String decision(Integer number){
		
		String sFizz, sBuzz, sDecision;
		
		sDecision = "";
		sFizz = fizz(number);
		sBuzz = buzz(number);
		
		if(sFizz == "Fizz") sDecision = sFizz;
		if(sBuzz == "Buzz") sDecision = sDecision + sBuzz;
		if(sFizz == "No" & sBuzz == "No") sDecision = number.toString();
		
		return sDecision;
	}
	public String fizz(int number){
		
		if(number % 3 == 0) return "Fizz";
		else return "No";
	}
	
	public String buzz(int number){
		
		if(number % 5 == 0) return "Buzz";
		else return "No";
	}
}
