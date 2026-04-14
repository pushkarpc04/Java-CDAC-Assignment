package utility;

public class Mynumber implements advIntOperation, BasicIntOperations {

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num %2 ==0) {
			return false;
		}else
		
		return true;
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num %2==0)
		return true;
		else 
			return false;
	}

	@Override
	public boolean isPrime(int num) {
	    if (num <= 1) {
	        return false;
	    }

	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}

	@Override
	public double calfactorial(int num) {
		// TODO Auto-generated method stub
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
