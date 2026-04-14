import java.util.*;

class Date {
	private int dd, mm, yy;
	
	static int count;
	static{
		count =0;
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