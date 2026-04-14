package utility.math;
public class Calculator{
	 static int no1, no2;
	
	
	
	public Calculator(){
		
	}
	
	public Calculator(int no1, int no2){
		this.no1= no1;
		this.no2=no2;
	}
	
	static  int Add(){
		return no1 +no2;
		
	}
	
	static  int Sub(){
		return no1 -no2;
		 
	}
	
	public void displaycal(){
		System.out.println("The calculation Add is: "+ Add());
		
		System.out.println("The calculation of sub is: "+ Sub());
	}
}