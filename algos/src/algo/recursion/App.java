package algo.recursion;

public class App {

	public static void main(String[] args) {
		
//		reduceByOne(10);
		

	}
	
	public static void reduceByOne(int n) {
		if (n>=0) { 		// BASE CASE
			reduceByOne(n-1);		// RECURSION
		}
		
		System.out.println("Completed Call : " + n);
		
	}
	


}


   
