import java.util.*;
class Perfectno{
	public static void main(String [] args){
		int num;
		Scanner Sc = new Scanner(System.in);
		int sum =0;
			System.out.println("Please enter the number to check");
			num = Sc.nextInt();
			
			
			//System.out.println("The divisors of given numbers are ");
			for(int i=1;i<=num-1;i++){
				if(num % i ==0){
					sum =sum+i;
			
			System.out.print(i);
			System.out.print("+");			
				}
			}
			
			System.out.print("="+sum);
			
			if(sum == num){
				System.out.println("\nEntered Number is perfect "+ num);
			}else{
				System.out.println("\nEntered Number is not perfect number" +num);
			}
		
			
	}
}
