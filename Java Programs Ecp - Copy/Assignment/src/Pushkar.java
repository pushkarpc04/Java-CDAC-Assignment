
public class Pushkar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Welcome1@23"; 
		
		for(int i=0;i< s.length();i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <='z')
				System.out.println(s.charAt(i) +" It is small charater");
			else if(ch >= 'A' && ch <='Z')
				System.out.println(s.charAt(i)+" It is uppercase");
			else if(ch >='0' && ch <='9')
				System.out.println(s.charAt(i)+" The given string contains the numeric value ");
			else
				System.out.println(s.charAt(i)+" Contains special symbol");
		}

	}

}
