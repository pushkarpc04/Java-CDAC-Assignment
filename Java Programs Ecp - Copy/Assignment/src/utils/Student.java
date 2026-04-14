package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	private int rollno;
	private String name;
	private float marks;
	
	Student(int rollno, String name, float marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public float getMarks() {
		return marks;
	}



	public static void main(String[] args) {
		  BufferedReader br = null;
		try {
		 br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the students details : ");
		System.out.println("Enter the roll no : ");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("Enter the Name : ");
		String name = br.readLine();
		System.out.println("Enter the marks : ");
		float marks = Float.parseFloat(br.readLine());
		calGrade(marks);
		
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
	
	
	
	
	
	public static void calGrade(float marks) {
		if(marks >=90 && marks <=100) {
			System.out.println("Excellent Grade :");
		} else if(marks >=80 && marks <=89) {
			System.out.println("Good Grade :");
		}else if(marks >=65 && marks <= 79) {
			System.out.println("Average Grade : ");
		}else
			System.out.println("Need improvement in grades :");
		
		
	}
	

}
