package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Emailsorts {

	public static void main(String[] args) throws Exception {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		String path ="E:\\Knowit\\Java\\files handling\\";
		BufferedReader br = new BufferedReader(new FileReader(path+"emails.txt"));
		String str;
		while((str = br.readLine()) != null) {
			if(str.contains("@gmail.com")) {
				l1.add(str);
			}
			else {
				l2.add(str);
			}
			
		}
		br.close();
		
		System.out.println("The list containing the @gmail.com is : ");
		System.out.println(l1);
		

		System.out.println("The list not containing the @gmail.com is : ");
		System.out.println(l2);

	
	}
	

}
