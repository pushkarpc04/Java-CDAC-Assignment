 public class Person{
	
	private String name;
	Date bdate;
	
	public Person(){
		name = new String(" ");
		bdate = new Date();}
	
	public Person(String name , Date bdate){
		this.name = name;
		this.bdate =bdate;
	}
	public Person(String name, int dd, int mm, int yy){
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display(){
		System.out.println("Name is :" +name);
		System.out.println("Birthdate is: " );
		bdate.display();
	}
}