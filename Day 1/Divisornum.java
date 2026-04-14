import java.util.*;
class Divisornum{
	public static void main(String [] args){
		int num;
		Scanner Sc = new Scanner(System.in);
		
			System.out.println("Please enter the number to check");
			num = Sc.nextInt();
			
			
			System.out.println("The divisors of given numbers are ");
			for(int i=1;i<=num;i++){
				if(num % i ==0){
				System.out.println(i);
				}
			}
		
			
	}
}
