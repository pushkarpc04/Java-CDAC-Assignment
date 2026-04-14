import java.util.*;

class ArrayDemo {
	
public static void main(String[] args){
	
     int [] arr;
	arr = new int[5];
	
    Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the five elements for array :");
	for(int i =0;i< arr.length;i++){
		arr[i] =Sc.nextInt();
	}
	
	 int max = arr[0];
	for(int i = 1; i < arr.length; i++) {
		if(max < arr[i]) 	
		      max = arr[i];
  	}
	System.out.println("Array max : "+max);
	int secondmax = 0;
	for(int i=0; i<arr.length;i++){
		if (arr[i] > secondmax && arr[i] < max) {
                secondmax = arr[i];
            }
	}
	
	System.out.println("Array of second max : "+secondmax);
	
	 int min = arr[0];
	for(int i = 1; i < arr.length; i++) {
		if(min > arr[i]) 	
		      min = arr[i];
  	}
	System.out.println("Array min : "+min);
	
	float sum = arr[0];
	for(int i =1 ;i<arr.length;i++){
		 sum = sum + arr[i];
	}
	
	float avg = (sum / arr.length);
	System.out.println("Average of array is :"+avg);

}

}