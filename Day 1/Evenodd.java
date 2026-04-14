import java.util.*;
class Evenodd{
	public static void main(String [] args){
		int num;
		Scanner Sc = new Scanner(System.in);
		
			System.out.println("Please enter the number to check");
		num = Sc.nextInt();
		if(num %2==0){
			System.out.println("The given number is Even :" +num);
		}else{
			System.out.println("The given number is odd :" +num);
		}
	}
}
		