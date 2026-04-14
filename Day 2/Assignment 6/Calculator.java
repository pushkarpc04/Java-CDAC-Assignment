import java.util.*;
class Calculator{
	private int no1, no2;
	private int sol;
		Scanner Sc = new Scanner(System.in);
	
	
	public void accept(){
		System.out.println("Enter the first number");
		no1= Sc.nextInt();
		System.out.println("Enter the second number ");
		no2=Sc.nextInt();
	}
	
	public void Add(){
		sol = no1 + no2;
		
		System.out.println("The addition calculation is :"+sol);
	}
	
	public void Sub(){
	sol = (no1-no2);	
	
	
		System.out.println("The  substract calculation is :"+sol);
	}
	public void Multi(){
		sol = (no1 * no2);
		
		
		System.out.println("The multiplication calculation is :"+sol);
	}
	public void Div(){
		sol = (no1 / no2);
		
		
		System.out.println("The division calculation is :"+sol);
	}
	
	
}