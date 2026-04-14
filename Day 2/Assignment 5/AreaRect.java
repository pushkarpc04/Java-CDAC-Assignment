public class AreaRect{
	public static void main(String [] args){
		
		Rectangle R1 = new Rectangle();
		
		R1.Calarea();
		R1.display();
		
		
		Rectangle R2 = new Rectangle(4,10);
		
		R2.Calarea();
		R2.display();
		
		Rectangle R3 = new Rectangle(R2);
		
		R3.Calarea();
		R3.display();
	}
	
}