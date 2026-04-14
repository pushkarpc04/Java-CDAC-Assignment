
public class Pushkarday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		changevalue(n);
		System.out.println("Value after change is : "+n);
		int [] arr = {10,20,30};
		
		cahngeArray(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void changevalue(int n) {
		n =20;
		
	}
	public static void cahngeArray(int []arr) {
		arr[0] =100;
		arr[1] =500;
		arr[2] =400;
		
	}
	

}
