class PersonDemo{
public static void main(String [] args ){
	
	Person p1 = new Person();
	p1.display();
	
	String nm = new String ("Sachin " );
	Date d1 = new Date(24,4,1973);
	Address permadrs = new Address("123, Ganesh Colony", "Karvenagar","Pune","Maharashtra",411004);
	Address presentadrs = new Address("45/A, Sharada Society", "Dadar","Mumbai","Maharashtra",400004);
	Person p2 = new Person(nm, d1,permadrs,presentadrs);
	p2.display();
	
	System.out.println("___________________________________________________");
	
	Person p3 = new Person("Sachin",24,4,1973,"123, Ganesh Colony", "Karvenagar","Pune","Maharashtra",411004,"45/A, Sharada Society", "Dadar","Mumbai","Maharashtra",400004);
	p3.display();
}
}