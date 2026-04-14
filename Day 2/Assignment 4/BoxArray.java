class BoxArray{

    public static void main(String [] args) {
	Box [] bxxx;
	bxxx = new Box[3];
	bxxx[0] = new Box(10,5,7);
	
	bxxx[1] = new Box(12,10,7);
	bxxx[2] = new Box(10,5,7);
	
	for(int i=0;i<bxxx.length;i++) {
	     System.out.println("Volume : "+bxxx[i].Calvol());
        } 
	}
}