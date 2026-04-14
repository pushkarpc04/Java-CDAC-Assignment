class Date {
	
	private int day , month, year;
	
	void setdate(int day,int month,int year){
		this.day=day;
		this.month = month;
		this.year = year;
	}
	
	void getdate(){
		System.out.println("Date is :"+day+"/"+month+"/"+year);
	}
	
	Boolean isleapyear(){
		if((year % 4==0 && year % 100 !=0)||(year % 400 ==0)){
			return true;
	}else{
			return false;
	}
	}
}