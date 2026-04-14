class Color{
	private int red, green , blue;
	
	Color(int red , int gree , int blue){
		
		if(red >=0 && red <=255)
			this.red =red;
			else red =0;
		
		
		if(green >=0 && green <=255)
			this.green = green;
			else green =0;
				
		
		if(blue >=0 && blue <=255)
			
		this.blue = blue;
		else blue =0;
		
	}
	
	
	public void display(){
		   if(red==0 && green==0 && blue==0)
            System.out.println("Color is Black");

        else if(red==255 && green==255 && blue==255)
            System.out.println("Color is White");

        else if(red==255 && green==0 && blue==0)
            System.out.println("Color is Red");

        else if(red==0 && green==255 && blue==0)
            System.out.println("Color is Green");

        else if(red==0 && green==0 && blue==255)
            System.out.println("Color is Blue");

        else
            System.out.println("Color is RGBShade");
    }

}
