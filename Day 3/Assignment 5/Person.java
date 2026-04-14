 public class Person{
	
	private String name;
	Date bdate;
	Address permadrs;
	Address presentadrs;
	
	public Person(){
		name = new String("");
		bdate = new Date();
		permadrs = new Address();
		presentadrs = new Address();
	}
	
	public Person(String name , Date bdate, Address permadrs,Address presentadrs){
		this.name = name;
		this.bdate =bdate;
		this.permadrs =permadrs;
		this.presentadrs= presentadrs;
	}
	public Person(String name, int dd, int mm, int yy,String Locationdet,String Area, String City, String State, int pincode,String Locationdet1,String Area2, String City3, String State4, int pincode5){
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
		this.permadrs = new Address( Locationdet, Area,  City,  State,  pincode);
		this.presentadrs = new Address(Locationdet1, Area2,  City3,  State4,  pincode5);
	}
	
	public void display(){
		System.out.println("Name is :" +name);
		System.out.println("Birthdate is: " );
		bdate.display();
		System.out.println("Permanant Address of this person is :");
		permadrs.display();
		System.out.println("Presentat Address of this person is :");
		presentadrs.display();
	}
}