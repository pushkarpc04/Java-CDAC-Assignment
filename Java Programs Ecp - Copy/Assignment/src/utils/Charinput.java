package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Charinput {
public static void main(String[] args) {
	BufferedReader br = null;
	int count=0;
	try {
	br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the characters . press 'q' to exit" );
	int i;
	int acnt=0; 
	while((i =br.read())!='q') {
		System.out.println((char)i);
		if(i >='a' && i<='z' || i >='A' && i<='Z') {
			acnt++;
		}
		if(i >='0' && i<='9') {
			count++;
		}
		}
		System.out.println("Character count is : "+acnt +"\n Digit count is :"+ count);

	
	
	
	}
	catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}

