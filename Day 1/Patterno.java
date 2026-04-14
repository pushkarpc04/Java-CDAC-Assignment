import java.util.*;
class Patterno{
	public static void main(String [] args){

			Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int cur = rows;
            
            for (int j = 1; j <= i; j++) {
                System.out.print(cur);
                cur--;
            }
            
            System.out.println();
        }
		
		
		
	}
}	