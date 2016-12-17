package SampleTest;
import java.io.*;

public class Strpalindrome {
	
	public static void main(String args[]) throws IOException{
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		if(s != ""){
			System.out.println("Checking for String Palindrome");
			String reverse = new StringBuffer(s).reverse().toString();
			if(s.equalsIgnoreCase(reverse)){
				System.out.println("The string is Palindrome");
			}else{
				System.out.println("the string is not palindrome");
			}
		}else{
			System.out.println("The String is null");
			System.exit(0);
		}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
		
	}
}

