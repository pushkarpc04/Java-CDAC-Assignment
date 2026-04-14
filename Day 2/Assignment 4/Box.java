class Box {
	
	private int height, width, depth;
	
	
Box(int height, int width, int depth){
	this.height=height;
	this.width = width;
	this.depth = depth;
	
}

public void display(){
	System.out.println("Height is: " +height+" Width is "+width+" Depth is " +depth);
	
}
	
	public void Calvol(){
		int volume = (height * width * depth);
		System.out.println("The volume of box is :"+volume);
	}
}