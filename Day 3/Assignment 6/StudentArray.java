public class StudentArray{
    public static void main(String args[]){
        Student s[] = new Student[5];

        s[0] = new Student(1,"Pushkar", new int[]{70,80,70,80,90});
        s[1] = new Student(2,"Rohit", new int[]{60,75,85,70,80});
        s[2] = new Student(3,"Virat", new int[]{88,92,81,70,80});
        s[3] = new Student(4,"Noman", new int[]{65,70,70,80,72});
        s[4] = new Student(5,"Parth", new int[]{90,70,80,95,93});
		
		for(int i=0; i<s.length; i++){
			s[i].display();
		}
		int index = 0;
		double max = 0;
		for(int i=0; i< s.length;i++){
			if(s[i].calAverage() > max ){
				max = s[i].calAverage();
				index =i;
			}
		}
		 System.out.println();
		 System.out.println("Highest Average is of this student: ");
       
		s[index].display();

       }
}