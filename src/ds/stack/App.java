package ds.stack;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Stack theStack = new Stack(5);
		
//		theStack.push(10);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);

		Scanner s  = new Scanner(System.in);
		String str = s.next();
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String str) {
		
		Stack thisStack = new Stack(str.length());
		String output = new String();
		
		for(int i=0 ; i<str.length() ; i++) {
			thisStack.push(str.charAt(i));
		}
		
		while(!thisStack.isEmpty()) {
			output += thisStack.pop();
		}

		return output;
	}
	
}
