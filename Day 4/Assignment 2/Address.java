class Address{
	
	private String Locationdet, Area, City , State;
	private int pincode;
	
	
	public Address(){
		Locationdet = new String("");
		Area = new String("");
		City = new String("");
		State = new String("");
		this.pincode = pincode;
	}
	
	public Address(String Locationdet,String Area, String City, String State, int pincode){
		this.Locationdet =Locationdet;
		this.Area = Area;
		this.City=City;
		this.State=State;
		this.pincode= pincode;
	}
	public void display(){
		System.out.println(Locationdet+","+Area+","+City+","+State+":"+pincode);
	}
}