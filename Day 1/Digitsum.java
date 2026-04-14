import java.util.*;
class Digitsum{
	public static void main(String [] args){
		int num;
		Scanner Sc = new Scanner(System.in);
		int sum =0;
			System.out.println("Please enter the number to check");
			num = Sc.nextInt();
			
			
			while(num >0 || sum >10){
				if(num ==0){
					num = sum;
					sum =0;
				}
				sum = sum +num %10;
				num = num /10;
			}
			System.out.println("Single diigit sum of the number is : "+sum);
			
		}
	}
			