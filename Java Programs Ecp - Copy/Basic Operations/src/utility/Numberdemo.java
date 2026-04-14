package utility;

public class Numberdemo {

	public static void main(String[] args) {
		Mynumber util = new Mynumber();
		
		int testVal = 7;
		int factVal = 5;

		System.out.println("--- Basic & Advanced Integer Operations ---");
		
		
		System.out.println(testVal + " is Even? : " + util.isEven(testVal));
		System.out.println(testVal + " is Odd?  : " + util.isOdd(testVal));
		

		System.out.println(testVal + " is Prime? : " + util.isPrime(testVal));

		System.out.println("The Factorial of " + factVal + " is : " + util.calfactorial(factVal));
		
		System.out.println("-------------------------------------------");
		

		int anotherNum = 10;
		System.out.println(anotherNum + " is Prime? : " + util.isPrime(anotherNum));
		System.out.println("The Factorial of " + anotherNum + " is : " + util.calfactorial(anotherNum));
	}
}