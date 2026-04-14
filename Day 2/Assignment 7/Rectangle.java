class Rectangle{
	private int height, bredth;
	
	Rectangle(){
		height=5;
		bredth =5;
	}
	
	Rectangle(int height, int bredth){
		this.height = height;
		this.bredth= bredth;		
	}
	Rectangle(Rectangle r){
		this.height = r.height;
		this.bredth= r.bredth;
	}
	
	public double Calarea(){
		return height * bredth;
	}
	public void display(){
	System.out.println("Length is rectangle is :"+height+"\n The Bredth of rectangle is:"+bredth+"\n The area of rectangle is " +Calarea());}
	
}
