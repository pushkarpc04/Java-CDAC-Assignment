class Datedemo{
public static void main(String [] args){
	Date d1= new Date();
	d1.setday(16);
	d1.setmonth(4);
	d1.setyear(2003);
	
	System.out.println(d1.getday()+"/"+d1.getmonth()+"/"+d1.getyear());
}
}