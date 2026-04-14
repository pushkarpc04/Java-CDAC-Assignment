package utilities;

public class Exceptionhand {

	public static void main(String[] args) {
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		char ch = args[2].charAt(0);
		
		if(ch =='+') {
			System.out.println("The addition of two numbers is : "+(n1 +n2));
		}
		else if(ch =='-') {

			System.out.println("The substraction of two numbers is : "+(n1 -n2));
		} else if(ch =='x') {

			System.out.println("The multiplication of two numbers is : "+(n1 *n2));
		}
		else if(ch=='/') {

			System.out.println("The division of two numbers is : "+(n1 / n2));
		}
		
		
		}catch( ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException  e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
