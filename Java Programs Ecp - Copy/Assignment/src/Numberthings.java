import java.util.Iterator;
import java.util.Scanner;

public class Numberthings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first numbers : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number :");

		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Invalid inputs as second number should be greater than first");

		} else if (num1 == 0 || num1 == 1) {
			System.out.println("You cannot enter the the number 0 and 1 ");
		} else {
			for (int i = num1; i <= num2; i++) {
				int count = 0;
				for (int j = 2; j < i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0)
					System.out.print(i + " ");
			}
		}

	}

}
