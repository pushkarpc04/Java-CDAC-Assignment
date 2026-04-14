class Employee{
	private int empid;
	private String Ename;
	private int salary;

	Employee(int empid, String Ename, int salary){
		this.empid =empid;
		this.Ename = Ename;
		this.salary = salary;
	}
	
	void display(){
		
		System.out.println("Employee id is : "+empid+" Employee Name is : " +Ename+" Salary is :"+salary);
		
	}
	


}