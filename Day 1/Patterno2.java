import java.util.*;
class Patterno2{
	public static void main(String [] args){

			Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
		 int cur = 0;
        for (int i = 1; i <= rows; i++) {
           
            
            for (int j = 1; j <= i; j++) {
				cur++;
				
                System.out.print(" "+cur);
				
                
            }
            
            System.out.println();
        }
		
		
		
	}
}	