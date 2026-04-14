 package utility;

 public class Person{
	
	private String name;
	int age ;
	Date bdate;
	
	public Person(){
		name = new String("");
		age =0;
		bdate = new Date();
	}
	public Person(String name , int age, Date bdate){
		this.name = name;
		this.age = age;
		this.bdate =bdate;
	}
	
	public Person(String name , int age,int dd, int mm, int yy){
		this.name = name;
		this.age = age;
		this.bdate = new Date(dd,mm,yy);
	}
	
	
	public void display(){
		System.out.println("Name is :" +name);
		System.out.println("The age of person is: " +age);
		System.out.println("Birthdate is: " );
		bdate.display();
		
	}
}