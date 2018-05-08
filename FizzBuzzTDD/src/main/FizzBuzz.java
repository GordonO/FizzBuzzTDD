package main;

public class FizzBuzz {
	
	public String decision(Integer pInputNumber){
		
		String sFizz, sBuzz, sDecision;
		
		sDecision = "";
		sFizz = fizz(pInputNumber);
		sBuzz = buzz(pInputNumber);
		
		if(sFizz == "Fizz") sDecision = sFizz;
		if(sBuzz == "Buzz") sDecision = sDecision + sBuzz;
		if(sFizz == "No" & sBuzz == "No") sDecision = pInputNumber.toString();
		
		return sDecision;
	}
	
	public String fizz(int pFizzNumber){
		
		if(pFizzNumber % 3 == 0) return "Fizz";
		else return "No";
	}
	
	public String buzz(int pBuzzNumber){
		
		if(pBuzzNumber % 5 == 0) return "Buzz";
		else return "No";
	}
}
