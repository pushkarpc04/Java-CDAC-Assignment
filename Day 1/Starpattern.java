import java.util.*;
class Starpattern{
	public static void main(String [] args){
		int row;
		Scanner Sc = new Scanner(System.in);
		
			System.out.println("Please enter the number to print pattern");
			row = Sc.nextInt();
			for (int i = 1; i <= row; i++) {

             for (int j = row; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
			System.out.println(" ");
		}
			 
	}
}	