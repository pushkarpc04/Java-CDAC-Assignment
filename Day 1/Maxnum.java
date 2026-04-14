import java.util.*;

class Maxnum{
	public static void main(String[] args){
		int num1;
		int num2;
		int num3;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = Sc.nextInt();
		
		System.out.println("Enter the Sceond number");
		num2 = Sc.nextInt();
		
		System.out.println("Enter the third number");
		num3 = Sc.nextInt();
		/*
		if(num1>num2 && num2>num3){
			
		System.out.println("The number greatest number is" +num1);}
		else if(num1 <num2 && num2>num3){
			
		System.out.println("The  number greatest number is "+num2);
		} else{
			
		System.out.println("The number  greatest number" +num3);}
		*/
		
		int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The greatest number is: " + greatest);
        
		
	}
}
		