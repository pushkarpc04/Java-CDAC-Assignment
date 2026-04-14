import java.util.*;
class Fibonacho{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of number: ");
        int num = sc.nextInt();
		int a=0;
		int b=1;
		
		for(int i=0;i<=num;i++){
			
        System.out.print(a +" ");
			int c= a+b;
			a=b;
			b=c;
		}
		
		
	}
}