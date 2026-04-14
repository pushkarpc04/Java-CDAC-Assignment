import java.util.*;
class Reverno{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
        int revno =0;
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
		while(num>0){
			int temp = num%10;
			revno = revno*10 + temp;
			num = num/10;
			
		}
		System.out.println("Reverse number is : "+revno);

		
	}
	
}