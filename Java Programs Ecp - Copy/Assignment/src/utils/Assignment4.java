package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4 {

	public static void main(String[] args) {
		  BufferedReader br = null;
			try {
			 br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number for facters details : ");
			System.out.println("Enter the Number : ");
			int num = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=num ;i++) {
				if(num % i==0) {
					System.out.println(i);
				}
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}

}
