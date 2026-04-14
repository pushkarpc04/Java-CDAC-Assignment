package utilities;

import java.util.Scanner;

public class Excphand2 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want ");
		int size=sc.nextInt();
		int [] arr =new int[size];
		 
		System.out.println("Enter the array elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index number to acces the array element : ");
		int index = sc.nextInt();
		
		System.out.println("Element at your"+index+" of index is : "+arr[index]);
sc.close();
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("The entered index does not exists in the array : Be careful with index number ");
		//e.printStackTrace();
	}
		catch(Exception e) {
		e.printStackTrace();
	}
		
	}
}
