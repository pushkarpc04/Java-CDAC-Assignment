package utility;
import java.util.*;

public class Date {
	public int dd, mm, yy;
	
	static int count;
	static{
		count =0;
	}
	Date(){
		dd=0;
		mm=0;
		yy=0;
	}
	
	Date(int dd, int mm, int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
		count++;
	}
	public void display(){
		System.out.println("The date is :" +dd+"/"+mm+"/"+yy);
	}
	
	public static void displayCounter(){
		System.out.println("The counter is :"+count);
	}
	
	}