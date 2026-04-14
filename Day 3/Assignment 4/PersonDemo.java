class PersonDemo{
public static void main(String [] args ){
	
	Person p1 = new Person();
	p1.display();
	
	String nm = new String ("Thala" );
	Date d1 = new Date(7,7,1989);
	Person p2 = new Person(nm, d1);
	p2.display();
	
	Person p3 = new Person("Hitman",21,4,1995);
	p3.display();
}
}