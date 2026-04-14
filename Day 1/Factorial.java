import java.util.*;
class Factorial{
	public static void main(String [] args){
		int num;
		Scanner Sc = new Scanner(System.in);
		
			System.out.println("Please enter the number to check");
			num = Sc.nextInt();
			long f =1;
			for(int i =1 ;i<=num ;i++){
				f *=i;
			}
			System.out.println("The factorial of "+num+ "are " +f);
	
	
	}
}	