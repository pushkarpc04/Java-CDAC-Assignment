import java.util.*;
class Primeornot{
	public static void main(String [] args){
		int num;
		Scanner Sc = new Scanner(System.in);
		
			System.out.println("Please enter the number to check");
			num = Sc.nextInt();
			 boolean flag = true;          
			 if(num <=2){
				 System.out.println("The number is not a prime number as its is less than 2");
			 }
			 else if(num %2==0){
				 System.out.println("The entered number is not a prime number as it is even number");
			 }
			 else{
			 
         for(int i=2;i <= num/2; i++) {
	       if(num % i == 0) {
		    flag = false;
		    break;	
               }
         }
         if(flag == true)
            System.out.println( " It is the Prime number ");
	else
            System.out.println( "It is Not prime");
			 }
	}
}