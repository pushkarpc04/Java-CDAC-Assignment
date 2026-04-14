package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lineinp {

    public static void main(String[] args) {
        
        BufferedReader br = null;
        int maxLength = 0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the line. type 'quit' to exit");
            String str;
            
            while (!(str = br.readLine()).equals("quit")) {
                System.out.println(str);
                if (str.length() > maxLength) {
                    maxLength = str.length();
                }
            }

            System.out.println("Longest line length: " + maxLength);
            
           
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}